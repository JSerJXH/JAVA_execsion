package com.cn.Execsion;

public class Febonacc {
    public static void main(String[] args) {
        //菲薄那些数列：1 1 2 3 5 8 13
        System.out.println(feb(10));
    }
    public static int feb(int i ){
        if(i==1 || i==2){
            return 1;
        }else {
            return feb(i-1)+feb(i-2);
        }
    }
}
