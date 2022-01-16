package com.chd.edu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 21:13
 * @Version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info (){
        //创建文件信息
        File file =new File("e:\\info.docx");
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
//        try {
//            file.createNewFile();
//            System.out.println("创建成功");
//            System.out.println(file.getName());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
