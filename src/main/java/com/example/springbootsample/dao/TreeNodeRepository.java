package com.example.springbootsample.dao;

import com.example.springbootsample.bean.TreeNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wt
 * @create 2019-03-28 下午5:49
 */
public interface TreeNodeRepository extends JpaRepository<TreeNode, Integer> {

    /**
     * 删除
     * @param id
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query("delete from TreeNode where id like ?1")
    void deleteByTreeId(Integer id);
}
