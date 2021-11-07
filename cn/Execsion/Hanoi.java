package com.cn.Execsion;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(5,'a','b','c');

    }

    /**
     *
     * @param n 共有n个盘子
     * @param from 开始的柱子
     * @param in  中间的柱子
     * @param to  目标柱子
     *            无论有多少盘子，都认为只有两个，上面的和最下面的
     */
    public static void hanoi(int n,char from, char in ,char to){
        if(n ==1){
            System.out.println("第一个盘子"+from+"移到"+to+"位置");
        }else {
            //上面的移动到中间
            hanoi(n-1,from,to,in);
            //移动最下面的
            System.out.println("第"+n+"个盘子从"+from+"移到"+to+"位置");
            //上面的移动到目的的柱子
            hanoi(n-1,in,from,to);

        }
    }
}
