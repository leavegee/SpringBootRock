package com.yingu.balancing.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yingu.balancing.service.SampleService;

@RestController
public class ConsumerController {
	
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    private SampleService sampleService;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://SAMPLE-SERVICE/add?a=10&b=20", String.class).getBody();
    }
    
    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add2(){
    	return sampleService.addService();
    }
}