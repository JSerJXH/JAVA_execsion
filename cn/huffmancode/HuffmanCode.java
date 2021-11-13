package com.cn.huffmancode;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HuffmanCode {
    public static void main(String[] args) {
        String str = "i like like like java do you like a java";
        byte[] strBytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(strBytes.length);//40
        List<Node> j = getNodes(strBytes);
        System.out.println(j);
    }

    /**
     *
     * @param bytes  接受返回的子数组
         * @return 返回的就是List 形式，
     */
    private static List<Node> getNodes(byte[] bytes){
        //创建一个ArrayList
        ArrayList<Node> nodes = new ArrayList<Node>();
        //创建HashMap
        HashMap<Byte, Integer> counts = new HashMap<>();
        //遍历Bytes 统计每一个byte出现的次数->map[key,value]
        for(byte b:bytes){
            Integer count = counts.get(b);
            if(count ==null){
                counts.put(b,1);
            }else {
                counts.put(b,count+1);
            }
        }
        //遍历map
        for(Map.Entry<Byte,Integer> entry: counts.entrySet()){
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }
}

class Node implements Comparable<Node>{
    Byte data; //存放数据本身，比如‘a’=97
    int weight;//权值，表示数据出现的次数
    Node zuo;
    Node you;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight-o.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if (this.zuo!=null){
            this.zuo.preOrder();
        }
        if(this.you!=null){
            this.you.preOrder();
        }
    }
}