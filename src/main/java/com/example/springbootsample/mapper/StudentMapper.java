package com.example.springbootsample.mapper;

import com.example.springbootsample.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wt
 * @create 2019-03-23 上午9:10
 */
//@Mapper
public interface StudentMapper {

    @Select("select * from student where name=#{name}")
    List<Student> getStudent(String name);

    @Insert("insert into student values(#{name}, #{age})")
    void insertStudent(Student student);
}
