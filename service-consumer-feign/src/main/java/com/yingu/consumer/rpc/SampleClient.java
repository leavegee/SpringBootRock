package com.yingu.consumer.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yingu.consumer.hytrix.SampleClientHystrix;

//@FeignClient("sample-service")
@FeignClient(value = "sample-service", fallback = SampleClientHystrix.class)
public interface SampleClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
