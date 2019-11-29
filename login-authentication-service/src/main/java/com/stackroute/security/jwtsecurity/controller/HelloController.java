package com.stackroute.security.jwtsecurity.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("resti");
        return "Hello World";
    }
}
