package com.yingu.nativeservice.contractservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "world";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
