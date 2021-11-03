package com.sort.tset;

//import Myself.execise.demo.Merge;
import com.sort.sort.Merge;


import java.util.Arrays;

public class MergeTest {

    public static void main(String[] args) {
        Integer[]a={1,1,1,1,1,1,1,1,1};
       Merge.sort(a);
        //Quick.sort(a);

        System.out.println(Arrays.toString(a));
    }


}
