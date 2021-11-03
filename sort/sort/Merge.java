package com.sort.sort;
/*
* 1.public static void sort(Comparable[] a)：对数组内的元素进行排序
2.private static void sort(Comparable[] a, int lo, int hi)：对数组a中从索引lo到索引hi之间的元素进
行排序
3.private static void merge(Comparable[] a, int lo, int mid, int hi):从索引lo到所以mid为一个子
组，从索引mid+1到索引hi为另一个子组，把数组a中的这两个子组的数据合并成一个有序的大组（从
索引lo到索引hi）
4.private static boolean less(Comparable v,Comparable w):判断v是否小于w
5.private static void exch(Comparable[] a,int i,int j)：交换a数组中，索引i和索引j处的值
*
* */

public class Merge {

    //定义一个临时数组
    private static Comparable[] assist;


    //对数组内的元素进行排序
    public static void sort(Comparable[] a){

        assist = new Comparable[a.length];
        int lo =0;
        int hi = a.length-1;
        sort(a,lo,hi);


    }
    //对数组a中从索引lo到索引hi之间的元素进行排序
    private static void sort(Comparable[] a, int lo, int hi){
        if(hi<=lo){
            return;
        }
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    /*
    * 从索引lo到所以mid为一个子
组，从索引mid+1到索引hi为另一个子组，把数组a中的这两个子组的数据合并成一个有序的大组（从
索引lo到索引hi）
    *
    * */
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;
        while (p1<=mid &&p2<=hi){
            if(less(a[p1],a[p2] ) ){
                assist[i] = a[p1];
                p1++;
                i++;
            }else {
                assist[i] = a[p2];
               p2++;
               i++;
            }
        }

        while (p1<=mid){
            assist[i] = a[p1];
            p1++;
            i++;
        }
        while (p2<=hi){
            assist[i] = a[p2];
            p2++;
            i++;
        }


        for(int index = lo;index<=hi;index++){
            a[index] = assist[index];
        }



    }
    //判断v是否小于w
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    //交换a数组中，索引i和索引j处的值
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
