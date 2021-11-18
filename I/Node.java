package com.cn.I;

public class Node {
    Object element;
    //下一个节点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
}
