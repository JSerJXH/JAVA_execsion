package com.cn.ExecsionTest;

import com.cn.Execsion.Node;

public class NodeTest {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2);
        n1.append(n3);
        //去除下一个节点
        System.out.println(n1.next().next().getData());
        System.out.println(n2.next().getData());
        System.out.println(n3.next().getData());

    }
}
