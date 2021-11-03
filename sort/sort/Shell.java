package com.sort.sort;

//1.public static void sort(Comparable[] a)：对数组内的元素进行排序
//2.private static boolean greater(Comparable v,Comparable w):判断v是否大于w
//3.private static void exch(Comparable[] a,int i,int j)：交换a数组中，索引i和索引j处的值



public class Shell {
    public static void sort(Comparable[] a){
       //先获得H的值
        int h =1;
        while (h< (a.length/2)){
            h=2*h+1;

        }
        //进行排序
       while (h>0){
           //找到待处理的元素的位置
           for(int i =h;i< a.length;i++){
               //找到一组数据中的元素
               for(int j =i;j>=h;j-=h){
                   //比较一组数据中j和之前位置元素的大小如果ture（大于0），则交换位置，否则退出比较
                   if(greater(a[j-h],a[j])){     //注意前后比较的顺序，前比后大交换位置，
                       exch(a,j-h,j); //
                   }else{
                       break;
                   }

               }

           }
           //第一轮结束以后将H变小继续下一轮更换位置
           h=h/2;
       }


    }


    private static boolean greater(Comparable v,Comparable w){
        int result = v.compareTo(w);//比较v和w的值
        return result>0;
    }

    //交换a数组中，索引i和索引j处的值
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp = a[i] ; //引入一个temp 将i的值赋予temp
        a[i]=a[j];//将J的值赋予i
        a[j]=temp; //temp 赋予j
        //完成i和j的交换


    }
}
