package com.yingu.nativeservice.contractservice;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.concurrent.Future;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.yingu.nativeservice.contractservice.async.AsyncTask;
import com.yingu.nativeservice.contractservice.config.BlogProperties;
import com.yingu.nativeservice.contractservice.domain.User;
import com.yingu.nativeservice.contractservice.web.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ContractServiceApplication.class)
@WebAppConfiguration
public class ContractServiceApplicationTests {
	private MockMvc mvc; 

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisTemplate<String, User> redisTemplate;
	
	@Autowired
	private BlogProperties blogProperties;
	
	@Autowired
	private AsyncTask task;
	
    @Before 
    public void setUp() throws Exception { 
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build(); 
    } 
    
    @Test
    public void testAsyncTaskReturnValue() throws Exception {
    	long start = System.currentTimeMillis();
    	Future<String> task4 = task.doTaskFour();
    	Future<String> task5 = task.doTaskFour();
    	while(true) {
    		if(task4.isDone() && task5.isDone()) {
    			// 三个任务都调用完成，退出循环等待
    			break;
    		}
    		Thread.sleep(1000);
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
    
    @Test
	public void testAsyncTask() throws Exception {
		task.doTaskOne();
		task.doTaskTwo();
		task.doTaskThree();
	}
    
    @Test
	public void getReadProperties() throws Exception {
		Assert.assertEquals(blogProperties.getName(), "devDD");
		//Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
	}
    
    @Test
	public void testRedis4Object() throws Exception {
		// 保存对象
		User user = new User("超人", 20);
		redisTemplate.opsForValue().set(user.getName(), user);
		user = new User("蝙蝠侠", 30);
		redisTemplate.opsForValue().set(user.getName(), user);
		user = new User("蜘蛛侠", 40);
		redisTemplate.opsForValue().set(user.getName(), user);
		Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
		Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
		Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
	}
    
    @Test
	public void testRedisStart() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }
    
    @Test 
    public void testUserController() throws Exception { 
        // 测试UserController 
        RequestBuilder request = null; 

        // 1、get查一下user列表，应该为空 
        request = get("/users/"); 
        mvc.perform(request) 
                .andExpect(status().isOk()) 
                .andExpect(content().string(equalTo("[]"))); 

        // 2、post提交一个user 
        request = post("/users/") 
                .param("id", "1") 
                .param("name", "测试大师") 
                .param("age", "20"); 
        mvc.perform(request) 
                .andExpect(content().string(equalTo("success"))); 

        // 3、get获取user列表，应该有刚才插入的数据 
        request = get("/users/"); 
        mvc.perform(request) 
                .andExpect(status().isOk()) 
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]"))); 

        // 4、put修改id为1的user 
        request = put("/users/1") 
                .param("name", "测试终极大师") 
                .param("age", "30"); 
        mvc.perform(request) 
                .andExpect(content().string(equalTo("success"))); 

        // 5、get一个id为1的user 
        request = get("/users/1"); 
        mvc.perform(request) 
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}"))); 

        // 6、del删除id为1的user 
        request = delete("/users/1"); 
        mvc.perform(request) 
                .andExpect(content().string(equalTo("success"))); 

        // 7、get查一下user列表，应该为空 
        request = get("/users/"); 
        mvc.perform(request) 
                .andExpect(status().isOk()) 
                .andExpect(content().string(equalTo("[]"))); 

    } 
    
	@Test
	public void contextLoads() {
	}

}
