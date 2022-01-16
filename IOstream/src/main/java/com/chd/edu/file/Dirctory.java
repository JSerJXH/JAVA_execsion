package com.chd.edu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 21:23
 * @Version 1.0
 */
public class Dirctory {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String path = "e:\\news1.txt";
        File file = new File(path);
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("没有文件");
        }

    }
    @Test
    public void m2(){
        String path = "e:\\demo";
        File file = new File(path);
        if(file.exists()){
            file.delete();
            System.out.println("dele");
        }else {
            file.mkdir();
            System.out.println("mkdir");
        }
    }
    @Test
    public void m3(){
        String path = "e:\\demo\\demo\\1\\2";
        File file = new File(path);
        if(file.exists()){
            file.delete();
            System.out.println("dele");
        }else {
            file.mkdirs();
            System.out.println("mkdirs");
        }
    }
}
