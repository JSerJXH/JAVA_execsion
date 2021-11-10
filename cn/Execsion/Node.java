package com.cn.Execsion;

public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;
    private int value;

    public Node(int j){
        data = j;
    }
    public Node append(Node i){
       //当前节点
        Node currentNode =this;
        while (true){
            Node nextNode = currentNode.next;
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
    public Node next(){
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
