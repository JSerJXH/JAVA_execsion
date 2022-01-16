package com.chd.edu.output;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 22:40
 * @Version 1.0
 */
public class copy {
    public static void main(String[] args) {
        String path1 ="e:\\3.jpg";
        String path2 ="d:\\c01.jpg";
        FileInputStream fi=null;
        FileOutputStream fo=null;
        try {
            fi=new FileInputStream(path1);
            fo=new FileOutputStream(path2);
            byte[] bytes = new byte[1024];
            int readl;
            while ((readl=fi.read())>0){
                fo.write(bytes,0,readl);
            }
            System.out.println("结束");
            fo.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fi != null) {
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void copy01(){
       String path1 ="e:\\3.jpg";
       String path2 ="d:\\c01.jpg";
       FileInputStream fi=null;
       FileOutputStream fo=null;
        try {
            fi=new FileInputStream(path1);
            fo=new FileOutputStream(path2);
            byte[] bytes = new byte[1024];
            int readl;
            while ((readl=fi.read())>0){
                fo.write(bytes,0,readl);
            }
            System.out.println("结束");
            fo.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fi != null) {
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
