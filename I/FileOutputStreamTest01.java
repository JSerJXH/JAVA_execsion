package com.cn.I;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //fos=new FileOutputStream("temp",true);不清空源文件，直接追加
            fos=new FileOutputStream("temp");
            //开始写
            byte[]bytes={97,98,99,100,101};

            fos.write(bytes);
            //从0写道3
           // fos.write(bytes,0,2);


            //写完以后，最后一定要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
