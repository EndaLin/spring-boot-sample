package com.example.springbootsample.dao;

import com.example.springbootsample.bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wt
 * @create 2019-03-27 下午9:28
 */
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
