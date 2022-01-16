package com.chd.edu.output;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Author Big_Sea
 * @Date 2022/1/11 22:15
 * @Version 1.0
 */
public class FileOutput01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        File mkdirs = new File("e:\\dempdemo\\demo");
        if (mkdirs.exists() ) {
            System.out.println("exists");
        }else {
            mkdirs.mkdirs();
            System.out.println("mkdirs");
        }


        String path = mkdirs.getAbsolutePath()+"/a.txt";

        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(path,true);
            //fileOutputStream.write('a');
            String str = "姜旭海";
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            System.out.println("over");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
