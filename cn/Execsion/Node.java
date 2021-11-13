package com.cn.Execsion;

public class Node {
    //节点内容
    int data;
    //下一个节点
    com.cn.huffmancode.Node next;
    private int value;

    public Node(int j){
        data = j;
    }
    public com.cn.huffmancode.Node append(com.cn.huffmancode.Node i){
       //当前节点
        com.cn.huffmancode.Node currentNode =this;
        while (true){
            com.cn.huffmancode.Node nextNode = currentNode.next;
            if(nextNode == null){
                break;
            }
            currentNode=nextNode;
        }
        //将要加入的数放在下一个地方
        currentNode.next=i;
        return this;

    }
    //取出下一个节点
    public com.cn.huffmancode.Node next(){
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    //获取节点中的数据
    public int getData(){
        return data;
    }
    public boolean isLast(){
        return next == null;
    }
}
