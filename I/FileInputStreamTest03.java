package com.cn.I;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("G:\\temp.txt");

            byte[] bytes = new byte[4]; //创建一个4个长度的byte数组，一次最多读取4个字节
          //返回值读取到的是字节数量，不是字节本身
           int readCount =fis.read(bytes);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
