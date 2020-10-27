package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String HomeGreeting() {
        return "Hello, World!";
    }

    @RequestMapping("/hello")
    public String HelloGreeting() {
        return "Hello!";
    }

    @RequestMapping("/world")
    public String WorldGreeting() {
        return "World!";
    }
}
