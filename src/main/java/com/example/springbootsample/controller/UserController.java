package com.example.springbootsample.controller;

import com.example.springbootsample.bean.User;
import com.example.springbootsample.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wt
 * @create 2019-03-23 下午3:04
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/user")
    public User getUser(User user) {
        return userRepository.save(user);
    }
}
