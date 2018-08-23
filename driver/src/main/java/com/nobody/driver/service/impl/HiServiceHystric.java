package com.nobody.driver.service.impl;

import com.nobody.driver.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
