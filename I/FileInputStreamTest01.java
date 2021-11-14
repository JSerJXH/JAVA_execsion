package com.cn.I;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\ArcGIS_Project\\2000\\2020.xls");

            //读取数据
            int readDate = fis.read();
            System.out.println(readDate);



        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fis == null) {  //避免空指针异常
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
