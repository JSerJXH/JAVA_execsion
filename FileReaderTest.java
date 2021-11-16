package com.cn.I;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文本输入流
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            //创建文件输入流
            reader = new FileReader("temp");
            //开始读取文件
            char[] chars = new char[4];
            int readCount =0;
            while ((readCount=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
