package com.cn.I;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream +FileOutputStream 完成文件的拷贝
拷贝的过程应该是一边读一边写
使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么文件都可以

 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建一个输入流
            fis=new FileInputStream("G:\\中国气象地面资料日值数据.zip");
            //创建一个输出流
            fos=new FileOutputStream("f:\\中国气象地面资料日值数据.zip");
            //一边读一边写
            byte[] bytes = new byte[10240 * 10240];
            int readCount=0;
            while ((readCount= fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开处理异常
            //一起try 影响别人关闭
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
