package com.example.springbootsample.bean;

import javax.persistence.*;
import java.util.List;

/**
 * @author wt
 * @create 2019-03-27 下午8:20
 */
@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue
    private Integer tid;

    private String name;

    @ManyToOne
    @JoinColumn(name = "pid")
    private Principal principal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher", fetch = FetchType.EAGER)
    private List<Student> students;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
