package com.chd.edu;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入doGet-----------");
        //1. 要获取下载文件的路径
        String realpath="F:\\My_Program\\Java_Program\\javaweb_02_servlet\\respose\\src\\main\\resources\\img.png";
        System.out.println("下载路径"+realpath);
        //2. 下载的文件名是啥？
        String filename=realpath.substring(realpath.lastIndexOf("\\"));
        //3. 设置想办法让浏览器能够支持下载我们需要的东西
        resp.setHeader("Content-disposition","attachment;filename"+filename);
        //4. 获取下载文件的输入流
        FileInputStream fileInputStream = new FileInputStream(realpath);
        //5. 创建缓冲区
        int len =0;
        byte[] buffer = new byte[1024];
        //6. 获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
        //7. 将FileOutputStream流写入到buffer缓冲区
        while ((len=fileInputStream.read(buffer))>0){
            outputStream.write(buffer,0,len);
        }
        fileInputStream.close();
        outputStream.close();
        //8. 使用OutputStream将缓冲区中的数据输出到客户端！
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
