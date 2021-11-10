package com.cn.Execsion;

public class TreeNode {
    //权
    int value;
    //左儿子
    TreeNode zNode;
    //右儿子
    TreeNode yNode;

    public TreeNode(int i) {
        value = i;
    }

    //设置左儿子
    public void setzNode(TreeNode zNode) {
        this.zNode = zNode;
    }

    //设置右儿子
    public void setyNode(TreeNode yNode) {
        this.yNode = yNode;
    }

    //前序遍历
    public void frontShow() {
        System.out.println(value);
        //左节点
        if (zNode != null) {
            zNode.frontShow();
        }
        //右节点
        if (yNode != null) {
            yNode.frontShow();
        }

    }

    public void midShow() {
        //左节点
        if (zNode != null) {
            zNode.midShow();
        }
        System.out.println(value);
        //右节点
        if (yNode != null) {
            yNode.midShow();
        }
    }

    public void afterShow() {
        //左节点
        if (zNode != null) {
            zNode.afterShow();
        }

        //右节点
        if (yNode != null) {
            yNode.afterShow();
        }
        System.out.println(value);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", zNode=" + zNode +
                ", yNode=" + yNode +
                '}';
    }

    public TreeNode frontSearch(int i) {
       TreeNode target = null;
        if(value ==i){
            return this;
        }
        if(zNode!=null){
            target=zNode.frontSearch(i);
        }
        if(target!=null){
            return target;
        }
        if(yNode!=null){
            target=yNode.frontSearch(i);
        }

        return target;

    }
}


