package com.cn.ExecsionTest;

import com.cn.Execsion.MyQuenue;

public class MyQuenueTest {
    public static void main(String[] args) {
        MyQuenue ma = new MyQuenue();
        ma.add(8);
        ma.add(9);
        ma.add(6);
        ma.add(5);
        ma.add(4);
        ma.show();
        ma.poll();
        ma.poll();
        ma.poll();
        ma.poll();
        ma.show();

    }
}
