package com.cn.execsion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int temp=0;
        int arr[] ={4,6,8,5,9};
        /*adjustHeap(arr,1,arr.length);
        System.out.println("第一次"+ Arrays.toString(arr));
        System.out.println("===========================");
        adjustHeap(arr,0,arr.length);
        System.out.println("第二次"+ Arrays.toString(arr));*/
        for (int i= arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i, arr.length);
        }
        for(int j= args.length-1;j>0;j--){
            temp =arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            adjustHeap(arr,0, j);
        }

        System.out.println("数组"+Arrays.toString(arr));


    }
    //编写一个堆排序方法
    public static void heapsort(int arr[]){
        System.out.println("堆排序");

    }
    //将一个数组，调整成大顶堆

    /**
     *
     * @param arr 待调整数组
     * @param i 非叶子结点在数组中的索引
     *          i=1 sdjustHeap ={49856}
     *          i=
     * @param length    length是逐渐渐少的
     */
    public static void adjustHeap(int arr[] , int i, int length){
        int temp = arr[i];
        /**
         * k=i*2+1 k是i节点的左子节点
         */
        for (int k = i*2+1; k < arr.length ; k=k*2+1) {
            if(k+1< arr.length && arr[k]<arr[k+1]){//说明左子节点小于右子节点的值
                k++;//k指向右子节点
            }
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;//i指向k，继续循环比较
            }else {
                break;
            }
        }
        arr[i]=temp;

    }
}
