package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(@RequestParam("name") String name) {
        System.out.println(name);
        return "Hello, " + name + "!";
    }
}
