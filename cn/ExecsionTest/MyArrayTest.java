package com.cn.ExecsionTest;

import com.cn.Execsion.MyArray;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        int size = ma.size();
        System.out.println(size);
        ma.add(98);
        ma.add(97);
        ma.add(96);
        ma.size();
        System.out.println( ma.size());
        ma.show();
        System.out.println("--------------");
        ma.add(96);
        ma.add(98);
        ma.add(9);
        ma.add(6);
        ma.add(8);
        ma.add(7);
        ma.add(256);
        ma.show();
        ma.insert(2,10000);
        ma.show();
    }
}
