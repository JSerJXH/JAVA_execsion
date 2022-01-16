package com.chd.edu.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Big_Sea
 * @Date 2022/1/12 22:41
 * @Version 1.0
 */
public class FileWrite01 {
    public static void main(String[] args) {

        String path="e:\\note.txt";
        FileWriter fw=null;

        char[] chars={'a','b','c'};
        try {
            fw=new FileWriter(path,true);
            //写入单个字符
            fw.write('H');
            fw.write(chars);
            fw.write("姜旭海能学会".toCharArray(),0,5);
            fw.write("姜旭海");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("over");
    }
}
