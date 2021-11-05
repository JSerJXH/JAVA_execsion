package com.cn.ExecsionTest;

public class SearchTest {
    public static void main(String[] args) {
        int[]arr={2,4,6,7,9,10,51,54,8};
        int target = 8;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}
