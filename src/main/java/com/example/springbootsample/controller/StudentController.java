package com.example.springbootsample.controller;

import com.example.springbootsample.bean.Student;
import com.example.springbootsample.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wt
 * @create 2019-03-23 上午9:13
 */
@RestController
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/student/{name}")
    public List<Student> getStudent(@PathVariable("name") String name) {
        return studentMapper.getStudent(name);
    }

    @GetMapping("/student")
    public Student insertStudent(Student student) {
        studentMapper.insertStudent(student);
        return student;
    }
}
