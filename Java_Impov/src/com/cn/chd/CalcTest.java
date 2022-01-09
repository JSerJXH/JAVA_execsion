package com.cn.chd;

import org.junit.Test;

public class CalcTest {


    @Test
    public void sum(){
        int sum = Calc.sum(1, 2);
        System.out.println(sum);

    }
    @Test
    public void sum2(){
        int sum = Calc.sum(2, 3);
        System.out.println(sum);

    }
}
