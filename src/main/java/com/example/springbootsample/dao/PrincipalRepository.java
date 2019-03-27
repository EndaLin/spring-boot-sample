package com.example.springbootsample.dao;


import com.example.springbootsample.bean.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wt
 * @create 2019-03-27 下午9:26
 */
public interface PrincipalRepository extends JpaRepository<Principal, Integer> {
}
