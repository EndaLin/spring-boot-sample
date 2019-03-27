package com.example.springbootsample;

import com.example.springbootsample.bean.Principal;
import com.example.springbootsample.bean.Student;
import com.example.springbootsample.bean.Teacher;
import com.example.springbootsample.dao.PrincipalRepository;
import com.example.springbootsample.dao.StudentRepository;
import com.example.springbootsample.dao.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSampleApplicationTests {

    @Autowired
    PrincipalRepository principalRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    StudentRepository studentRepository;


    @Test
    public void insert() throws SQLException {
        // 创建校长实例, 并保存
        Principal principal = new Principal();
        principal.setName("principal");
        principalRepository.save(principal);

        // 创建老师实例, 并保存
        Teacher teacher = new Teacher();
        teacher.setName("teacher");
        teacher.setPrincipal(principal);
        teacherRepository.save(teacher);

        // 创建学生, 并保存
        Student student = new Student();
        student.setName("student");
        student.setTeacher(teacher);
        studentRepository.save(student);
    }


    @Test
    public void find() {
        List<Principal> listPrincipal = principalRepository.findAll();
        System.out.println(listPrincipal.get(0).toString());
    }
}
