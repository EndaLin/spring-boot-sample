package com.example.springbootsample.dao;

import com.example.springbootsample.bean.TreeNode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wt
 * @create 2019-03-28 下午5:49
 */
public interface TreeNodeRepository extends JpaRepository<TreeNode, Integer> {

}
