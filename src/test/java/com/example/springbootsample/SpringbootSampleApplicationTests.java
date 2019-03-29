package com.example.springbootsample;

import com.example.springbootsample.bean.Principal;
import com.example.springbootsample.bean.Student;
import com.example.springbootsample.bean.Teacher;
import com.example.springbootsample.bean.TreeNode;
import com.example.springbootsample.dao.PrincipalRepository;
import com.example.springbootsample.dao.StudentRepository;
import com.example.springbootsample.dao.TeacherRepository;
import com.example.springbootsample.dao.TreeNodeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    TreeNodeRepository treeNodeRepository;


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

    @Test
    public void insertTreeNode() {
        TreeNode treeNode = new TreeNode();
        treeNode.setName("one");
        treeNodeRepository.save(treeNode);

        TreeNode treeNode1 = new TreeNode();
        treeNode1.setName("two");
        treeNode1.setParent(treeNode);
        treeNodeRepository.save(treeNode1);

        TreeNode treeNode2 = new TreeNode();
        treeNode2.setName("three");
        treeNode2.setParent(treeNode1);
        treeNodeRepository.save(treeNode2);
    }

    @Test
    @Transactional
    public void deleteTreeNode() {
        TreeNode treeNode = treeNodeRepository.findById(5).get();
        TreeNode parent = treeNode.getParent();
        List<TreeNode> listChild = treeNode.getListChild();
        for (TreeNode child: listChild) {
            child.setParent(parent);
            treeNodeRepository.saveAndFlush(child);
        }
        treeNodeRepository.deleteByTreeId(treeNode.getId());
    }
}
