package com.sort.sort;

import java.util.Arrays;

public class TWO {
    public static void main(String[] args) {
        int []a ={3,4,6,7,2,7,2,8,0,5,45,8,
        };
        merge(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }



    public static void merge(int[]a, int star, int end){
        if(star<end){
            //设置标准数

            int key = a[star];
            //左边的启示
            int zuo = star;
            //右边的启示
            int you = end;
            int temp;
            //开始循环
            while (zuo < you){
                //左边的数字比



                while (zuo < you && a[you]>=key){
                    you--;
                }
//                temp =a[you];
//                a[zuo]=a[you];


                while(zuo < you && a[zuo]<=key){
                    zuo++;
                }
//                a[you]=a[zuo];
//                temp = a[you];
//                a[you]=a[zuo];
//                a[zuo]=temp;
//                temp = a[zuo];
//                a[zuo]=a[you];
//                a[you]=temp;
                if (zuo<you) {
                    temp = a[you];
                    a[you] = a[zuo];
                    a[zuo] = temp;}



            }
            a[zuo]=key;
            merge(a,0,zuo-1);
            merge(a,zuo+1,end);
        }


    }
}

