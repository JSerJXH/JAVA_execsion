package com.cn.Execsion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int arr[]={13,7,8,3,29,6,1};
        Nodes j=creatHuffmanTree(arr);
        preOrder(j);
    }
    //写一个遍历前序遍历的方法
    public static void preOrder(Nodes j){
        if(j!=null){
            j.perOrder();
        }else {
            System.out.println("是空树，不能遍历");
        }
    }

    /**
     *
     * @param arr 要创建哈希满树的数组
     * @return  返回哈希满树的根节点
     */
    //创建赫夫曼树/哈夫曼树
    public static Nodes creatHuffmanTree(int[] arr){
        //1.为了操作方便，遍历数组
        //2.将每个元素构成一个Node
        //3.将Node放入到Arrylist中
        List<Nodes> root = new ArrayList<Nodes>();
        for (int i = 0; i < arr.length; i++) {
            root.add(new Nodes(arr[i]));
        }
        /*
        *处理的过程是循环处理的过程
        *
        *  */
        while(root.size()>1){
            //从小到大排序
            Collections.sort(root);
            //System.out.println("Nodes"+root);

            //取出根节点权值最小的两颗二叉树
            //1.取出权值最小的结点（二叉树）
            Nodes zuoNodes = root.get(0);
            //2.取出权值第二小的结点（二叉树）
            Nodes youNodes = root.get(1);
            //3.构建一个新的二叉树
            Nodes parent = new Nodes(zuoNodes.value + youNodes.value);
            parent.zuo= zuoNodes;
            parent.you=youNodes;
            //4.从ArrayList删除处理过的二叉树
            root.remove(zuoNodes);
            root.remove(youNodes);
            //5.将parent加入nodes
            root.add(parent);

            // System.out.println("第一次处理后"+root);
        }
        //返回哈夫曼树的root节点
        return root.get(0);
    }
}
class Nodes implements Comparable<Nodes>{
    int value;//结点权值
    Nodes zuo;//左节点
    Nodes you;//右节点
//写一个前序遍历
    public void perOrder(){
        System.out.println(this);
        if(this.zuo!=null){
            this.zuo.perOrder();
        }
        if(this.you!=null){
            this.you.perOrder();
        }
    }
    public Nodes(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Nodes{" +
                "value=" + value +
                '}';
    }
    public int compareTo(Nodes o){
        return this.value-o.value;
    }
}
