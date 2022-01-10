package com.edu.chd.ConfigTestServlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class HelloServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet03的doGet方法");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet03的doPost方法");
    }
}
