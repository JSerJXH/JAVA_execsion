package com.sort.sort;

public class Bubblec {
    /*
对数组a中的元素进行排序
*/
    public static void sort (Comparable[] a){
        for(int i = a.length-1; i>0 ;i-- ){
            for(int j = 0; j<i; j++){
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }

    }

    //比较元素v是否大于w
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w) > 0 ;

    }

    private static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

}
