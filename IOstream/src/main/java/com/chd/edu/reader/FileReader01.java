package com.chd.edu.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 23:17
 * @Version 1.0
 */
public class FileReader01 {
    public static void main(String[] args) {
        String filepath = "e:\\creat02.txt";
        FileReader fr=null;
        int data = 0;
        try {
            fr = new FileReader(filepath);
            while ((data = fr.read()) > 0){
                System.out.print((char)data);

            }
            System.out.println("over");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
