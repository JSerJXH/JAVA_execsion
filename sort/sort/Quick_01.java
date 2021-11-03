package com.sort.sort;

import java.util.Arrays;

public class Quick_01 {

    //交换
    private static void exch(int[]a,int i,int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;

    }
    //比大小
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    //整个序列排序
    public static void sort(int[]a){
        int lo =0;
        int hi = a.length-1;
        sort(a,lo,hi);
    }
    //lo，hi排序
    private static void sort(int[]a,int lo, int hi){
        if(lo>=hi){
            return;
        }
        int key = hexin(a,lo,hi);
        sort(a,lo,key-1);
        sort(a,key+1,hi);

    }
    //分组整理,返回一个数值
    private static int hexin(int[]a,int lo,int hi){
        int  key = a[lo];
        int zuo = lo;
        int you = hi;
        while (true){
            while (key > a[you]){
                you--;
                if(zuo == you){
                    break;
                }
            }
            while (a[zuo]<key){
                zuo++;
                if(zuo == you){
                    break;
                }
            }

            exch(a,lo,hi);




        }
    }

    public static void main(String[] args) {
        int[]a={10,5,6,8,8,9,3,15,7,56,2,6,3,1,5,54,56};
        System.out.println("---------");
        System.out.println(a);
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
