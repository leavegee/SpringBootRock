package com.yingu.balancing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SampleService {
	@Autowired
    RestTemplate restTemplate;
	
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://SAMPLE-SERVICE/add?a=10&b=30", String.class).getBody();
    }
    
    public String addServiceFallback() {
        return "error";
    }
}
