package com.cn.I;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 其他常用方法
* int available() 返回流当中剩余的没有读到的字节数量
* long skip（long n）跳过几个字节不读
* */
public class FileInputSreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("G:\\temp.txt");
            int readByte=fis.read();
            System.out.println(fis.available());//读取目前还剩下几个字节



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
