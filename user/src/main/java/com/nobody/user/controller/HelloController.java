package com.nobody.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
