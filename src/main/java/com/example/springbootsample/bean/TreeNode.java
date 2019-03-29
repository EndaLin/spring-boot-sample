package com.example.springbootsample.bean;

import javax.persistence.*;
import java.util.List;

/**
 * @author wt
 * @create 2019-03-28 下午5:36
 */
@Entity
public class TreeNode {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "pid")
    private TreeNode parent;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent", fetch = FetchType.EAGER)
    private List<TreeNode> listChild;


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

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode> getListChild() {
        return listChild;
    }

    public void setListChild(List<TreeNode> listChild) {
        this.listChild = listChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
