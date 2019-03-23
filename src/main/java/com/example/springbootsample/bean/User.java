package com.example.springbootsample.bean;

import javax.persistence.*;

/**
 * @author wt
 * @create 2019-03-23 下午2:57
 */
@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
