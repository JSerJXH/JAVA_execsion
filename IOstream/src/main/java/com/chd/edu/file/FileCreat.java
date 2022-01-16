package com.chd.edu.file;



import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreat {

    public static void main(String[] args) {

    }
    @Test
    public void creat01(){
        String path ="e:\\news1.txt";
        File file = new File(path);

        try {
            file.createNewFile();
            System.out.println("文件创建成功！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void creat02() throws Exception{
        String path="creat02.txt";
        File filename = new File("e:\\", path);
        filename.createNewFile();
        System.out.println("2");

    }

}
