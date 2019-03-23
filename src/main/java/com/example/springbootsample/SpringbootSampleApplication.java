package com.example.springbootsample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringBootApplication 来标注一个主程序类, 说明这是一个Spring Boot 应用
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@MapperScan("com.example.springbootsample.mapper")
@SpringBootApplication
public class SpringbootSampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootSampleApplication.class, args);
    }
}
