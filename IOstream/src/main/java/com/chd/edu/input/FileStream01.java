package com.chd.edu.input;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 21:45
 * @Version 1.0
 */
public class FileStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String path = "e:\\creat02.txt";
        FileInputStream fileInputStream =null;
        try {
             fileInputStream = new FileInputStream(path);
            int read;
            while ((read =fileInputStream.read())>0){
                System.out.print( (char)read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {

                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Test
    public void readFile02(){
        //String path = "e:\\creat02.txt";
        byte[] bytes = new byte[16];
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream("e:\\creat02.txt");
            int read;
            while ((read =fileInputStream.read(bytes))>0){
                System.out.print( new String(bytes,0,read));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {

                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
