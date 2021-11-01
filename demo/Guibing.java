package Myself.execise.demo;

import java.util.Arrays;

public class Guibing {
    public static void main(String[] args) {
        int[]a={2,5,6,8,9,7,3,0};
        sortgui(a,0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static void sortgui(int[]a,int low,int high){
        if(low<high){
            int mid = (high+low)/2;
            sortgui(a,low, mid);
            sortgui(a, mid+1,high );
            sort(a,low, mid,high );
        }


    }
    public static void sort(int[]a,int low,int mid,int high){
        int[]temp=new int[high-low+1];
        int i = low;
        int j = mid+1;
        int index = 0;
        while (i<=mid&&j<=high){
            if(a[i]<=a[j]){
               temp[index]=a[i];
                i++;
                index++;

            }else{
                temp[index]=a[j];
                j++;
                index++;
            }
        }
        while (i<=mid){
            temp[index]=a[i];
            i++;
            index++;
        }
        while (j<=high){
           temp[index]=a[j];
            j++;
            index++;
        }
        for (int x = 0;x< temp.length;x++){
            a[low+x]=temp[x];
        }
    }

}
