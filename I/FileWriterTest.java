package com.cn.I;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriterTest：
        文件字符输出流。写
        只能输入普通文件
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            //字符输出流
            writer=new FileWriter("file");
            //写入文件
             char[] chars={'我','是','你','爸','的'};
             writer.write(chars);

            //刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
