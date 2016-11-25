package com.yingu.nativeservice.contractservice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Future;

import javax.mail.internet.MimeMessage;

import org.apache.commons.collections.map.HashedMap;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.yingu.nativeservice.contractservice.async.AsyncTask;
import com.yingu.nativeservice.contractservice.config.BlogProperties;
import com.yingu.nativeservice.contractservice.domain.User;
import com.yingu.nativeservice.contractservice.mapper.UserMapper;
import com.yingu.nativeservice.contractservice.mq.Sender;
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
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private VelocityEngine velocityEngine;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
    private Sender sender;
	
	@Test
    public void helloMQ() throws Exception {
        sender.send();
    }
	
	/**
	 * mybatis插入测试
	 * @throws Exception
	 */
	@Test
	@Rollback
	public void findByName() throws Exception {
		userMapper.insert("ZZZ", 20);
		User u = userMapper.findByName("ZZZ");
		Assert.assertEquals(20, u.getAge().intValue());
	}
	
    @Before 
    public void setUp() throws Exception { 
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build(); 
    } 
    
    /**
     * 发送模板邮件
     * @throws Exception
     */
    @Test
    public void sendTemplateMail() throws Exception {
    	MimeMessage mimeMessage = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
    	helper.setFrom("dyc87112@qq.com");
    	helper.setTo("dyc87112@qq.com");
    	helper.setSubject("主题：模板邮件");
    	Map<String, Object> model = new HashedMap();
    	model.put("username", "didi");
    	String text = VelocityEngineUtils.mergeTemplateIntoString(
    			velocityEngine, "template.vm", "UTF-8", model);
    	helper.setText(text, true);
    	mailSender.send(mimeMessage);
    }
    
    /**
     * 发送嵌入静态资源邮件
     * @throws Exception
     */
    @Test
    public void sendInlineMail() throws Exception {
    	MimeMessage mimeMessage = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
    	helper.setFrom("dyc87112@qq.com");
    	helper.setTo("dyc87112@qq.com");
    	helper.setSubject("主题：嵌入静态资源");
    	helper.setText("<html><body><img src=\"cid:weixin\" ></body></html>", true);
    	FileSystemResource file = new FileSystemResource(new File("weixin.jpg"));
    	helper.addInline("weixin", file);
    	mailSender.send(mimeMessage);
    }
    
    /**
     * 发送附件邮件
     * @throws Exception
     */
    @Test
    public void sendAttachmentsMail() throws Exception {
    	MimeMessage mimeMessage = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
    	helper.setFrom("dyc87112@qq.com");
    	helper.setTo("dyc87112@qq.com");
    	helper.setSubject("主题：有附件");
    	helper.setText("有附件的邮件");
    	FileSystemResource file = new FileSystemResource(new File("weixin.jpg"));
    	helper.addAttachment("附件-1.jpg", file);
    	helper.addAttachment("附件-2.jpg", file);
    	mailSender.send(mimeMessage);
    }
    
    @Test
	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("474451886@qq.com");
		message.setTo("474451886@qq.com");
		message.setSubject("主题：简单邮件");
		message.setText("测试邮件内容");
		mailSender.send(message);
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
