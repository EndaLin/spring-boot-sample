package com.example.springbootsample.bean;

import javax.persistence.*;
import java.util.List;

/**
 * @author wt
 * @create 2019-03-27 下午8:20
 */
@Entity
public class Principal {

    @Id
    @GeneratedValue
    private Integer pid;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "principal", fetch = FetchType.EAGER)
    //@JoinColumn(name = "pid") 和mapperBy不能同时使用
    private List<Teacher> teachers;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
