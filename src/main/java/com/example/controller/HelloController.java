package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        System.out.println(name);
        return "Hello, " + name + "!";
    }
}
