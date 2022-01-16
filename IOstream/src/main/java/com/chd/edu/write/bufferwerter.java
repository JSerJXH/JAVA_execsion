package com.chd.edu.write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/15 9:57
 * @Version 1.0
 */
public class bufferwerter {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Big_Sea\\Desktop\\新建文本文档.sql"));
            String read=null;
            while ((read= bufferedReader.readLine())!=null
            ){
                System.out.print(read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
