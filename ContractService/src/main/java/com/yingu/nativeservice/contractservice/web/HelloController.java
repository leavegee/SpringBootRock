package com.yingu.nativeservice.contractservice.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/controller")  
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/world")
    public String world() {
        return "world";
    }
}