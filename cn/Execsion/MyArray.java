package com.cn.Execsion;

import java.util.Arrays;

public class MyArray {
    private int[] elements =new int[0];
    public MyArray(){

    }
    public int size(){
        return elements.length;
    }
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
        System.out.println(Arrays.toString(elements));

    }
    public void insert(int index,int j){
        int[]newArr=new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            if(i<index){
                newArr[i]=elements[i];
            }else {
                newArr[i+1]=elements[i];
            }
        }
        newArr[index]=j;
        elements=newArr;
    }
}
