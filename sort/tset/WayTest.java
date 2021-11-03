package com.sort.tset;

import com.sort.sort.Selection;
import com.sort.sort.Shell;

import java.io.*;
import java.util.ArrayList;

public class WayTest {


    public static void main(String[] args) throws IOException {
        //创建一个ArrayList集合，保存读取出来的整数
        ArrayList<Object> list = new ArrayList<>();
        //2.创建缓存读取流BufferedReader，读取数据，并存储到ArrayList中；
        BufferedReader reader = new BufferedReader(new InputStreamReader(WayTest.class.getResourceAsStream("reverse_arr.txt")));
        String line = null;
        while ((line = reader.readLine())!=null){
            //line 是字符串，吧line转换成Integer 存储到集合中

            int i= Integer.parseInt(line);
            list.add(i);


        }
        reader.close();

        //3.吧ArrayList集合转换成数组
        Integer[] a = new Integer[list.size()];

        list.toArray(a);
        //ShellTest(a);
        Selection(a);


        //4.调用测试代码完成测试




        }


    //希尔排序
    public static void ShellTest(Integer[] arr) {

        long star = System.currentTimeMillis();
        Shell.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("使用希尔排序耗时"+(end-star));



    }



    //Selection排序
    public static void Selection(Integer[] arr) {

        long star = System.currentTimeMillis();
        Selection.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("使用选择排序耗时"+(end-star));



    }
}
