package com.example.springbootsample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wt
 * @create 2019-03-05 下午9:51
 */
@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello " + name;
    }
}
