package com.chd.javaweb.servlet;

import jakarta.servlet.*;

import java.io.IOException;

public class AServlet implements Servlet {
    //无参数构造方法

    public AServlet() {
        System.out.println("BServlet执行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
