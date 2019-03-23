package com.example.springbootsample.dao;

import com.example.springbootsample.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpsRepository来完成对数据库的操作
 *
 * @author wt
 * @create 2019-03-23 下午2:52
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
