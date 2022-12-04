package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!\n";
    }
	
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World from MageEdu.com!";
    }
	
    @RequestMapping("/version")
    public String version() {
        return "Spring Boot Helloworld, version 0.9.6.\n";
    }
}
