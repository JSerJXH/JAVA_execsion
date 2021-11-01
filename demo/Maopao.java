package Myself.execise.demo;

import java.util.Arrays;

public class Maopao {
    public static void main(String[] args) {
        int []a={2,5,6,8,9,7,3,0,2,4,1};
        maopao(a);
        System.out.println(Arrays.toString(a));
    }



    private static void maopao(int[]a){
        int temp;
        for(int i =a.length-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(a[j]>a[j+1]){
                    temp =a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

}
