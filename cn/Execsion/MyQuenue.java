package com.cn.Execsion;

import java.util.Arrays;

public class MyQuenue {

    int[] elements = new int[0];
    //入列
    public void add(int j){
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];
        }
        newArr[elements.length]=j;
        //新数组替换旧数组
        elements=newArr;

    }
    public void show(){
        System.out.println(Arrays.toString(elements));}
    //出队
    public void poll(){
        int element = elements[0];
        int [] newArr = new int[elements.length-1];
        for (int i = 0; i <newArr.length ; i++) {
            newArr[i]=elements[i+1];
        }
    elements=newArr;
    }

}
