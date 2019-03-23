package com.example.springbootsample.config;

import com.example.springbootsample.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置类, 来替代之前的Spring配置文件
 *
 * 在Spring配置文件中, 这是用<bean></bean>标签来添加组件的
 *
 */
@Configuration
public class MyAppConfiguration {

    // 将方法的返回值添加到容器中, 容器中默认的组件id就是这个方法名
    @Bean
    public HelloService helloService() {
        System.out.println("添加组件");
        return new HelloService();
    }
}
