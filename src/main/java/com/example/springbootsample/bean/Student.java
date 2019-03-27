package com.example.springbootsample.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author wt
 * @create 2019-03-22 上午10:52
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer sid;

    private String name;

    @ManyToOne
    @JoinColumn(name = "tid")
    private Teacher teacher;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
