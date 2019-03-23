package com.example.springbootsample.bean;

import org.springframework.stereotype.Component;

/**
 * @author wt
 * @create 2019-03-22 上午10:52
 */
@Component
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
