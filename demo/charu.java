package Myself.execise.demo;

import java.util.Arrays;

public class charu {
    public static void main(String[] args) {
        int[]a={10,56,5,6,8,9};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int[]a){
        int temp;
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }

        }

    }
}
