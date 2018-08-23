package com.nobody.driver.controller;

import com.nobody.driver.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://USER-SERVICE/hi?name="+name,String.class);
    }
    @GetMapping(value = "/feign/hi")
    public String feignhi(@RequestParam String name) {
        return hiService.sayHiFromClientOne(name);
    }
}
