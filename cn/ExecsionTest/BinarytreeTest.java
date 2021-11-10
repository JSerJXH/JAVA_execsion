package com.cn.ExecsionTest;

import com.cn.Execsion.Binarytree;
import com.cn.Execsion.TreeNode;

public class BinarytreeTest {
    public static void main(String[] args) {
        //创建一棵树
        Binarytree bintree = new Binarytree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        bintree.setRoot(root);
        //创建一个左节点
        TreeNode rootz = new TreeNode(2);
        //将先创建的节点设置为根节点的左子节点
        root.setzNode(rootz);
        //创建一个右节点
        TreeNode rooty = new TreeNode(3);
        //将先创建的节点设置为根节点的右子节点
        root.setyNode(rooty);
        //第二层的左节点创建两个子节点
        rootz.setzNode(new TreeNode(4));
        rootz.setyNode(new TreeNode(5));
        //第二层的you节点创建两个子节点
        rooty.setzNode(new TreeNode(6));
        rooty.setyNode(new TreeNode(7));
        //前序遍历树
        bintree.frontShow();
        System.out.println("====================");
        //中序遍历树
        bintree.midShow();
        System.out.println("====================");
        //后续遍历
        bintree.afterShow();
        System.out.println("====================");
        //前序查找
        TreeNode result = bintree.frontSearch(5);
        System.out.println(result);
        System.out.println("====================");



    }
}
