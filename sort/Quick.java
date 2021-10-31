package com.sort.sort;

import java.util.Arrays;

public class Quick {

    //设定一个基准数，，然后设置两个指针，左边数大于基准数，右边数小于基准数
    public static void main(String[] args) {
        int[]a=  {6, 1, 2, 7, 9, 3, 4, 5, 8};
        sort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[]a,int star,int end){
        if(star<end){
        int key = a[star];
        int zuo =star;
        int you =end;
        int temp;

            while(zuo<you){
                while (zuo<you&&a[you]>=key){
                    you--;
                }a[zuo]=a[you];
                while (zuo<you&&a[zuo]<=key){
                    zuo++;
                }a[you]=a[zuo];


//                temp = a[you];
//                a[you]=a[zuo];
//                a[zuo]=temp;





            }
           a[you]=key;
            sort(a,star,you);
            sort(a,you+1,end);
        }

    }


}

