package com.sort.sort;
//Selection()：创建Selection对象
//1.public static void sort(Comparable[] a)：对数组内的元素进行排序
//2.private static boolean greater(Comparable v,Comparable w):判断v是否大于w
//3.private static void exch(Comparable[] a,int i,int j)：交换a数组中，索引i和索引j处的值


import java.util.ArrayList;

public class Selection {
//对数组内的元素进行排序
    public static void sort(Comparable[] a){
    for (int i=0;i<a.length-2;i++){   //遍历序号
        int minIndex = i;   //本次便利坐标是minIndex的是最小值
        for(int j =i+1;j<a.length;j++){    //
            if (greater(a[minIndex],a[j])){    //比较最小值和目前的值的大小
                minIndex = j;
            }

        }
        exch(a,minIndex,i);//交换最小值和目前数的位置
    }

        ArrayList<Integer> list = new ArrayList<>();


    }

   // 判断v是否大于w
   private static boolean greater(Comparable v,Comparable w){
        int result = v.compareTo(w);
        return result > 0;
   }


   //交换a数组中，索引i和索引j处的值


    private static void exch(Comparable[] a,int i,int j){
        Comparable temp = a[i]; //给一个临时的数值等于i
        a [i] = a [j];//让i = j
        a [j] = temp;//j = t  完成i和j 的交换

    }

}
