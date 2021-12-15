package com.cn.chd.javaweb.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class StudentServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //设置响应的内容类型
        response.setContentType("txt/html");
        PrintWriter out = response.getWriter();

        //连接JDBC
        Connection conn=null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            String url = "jdbc:mysql://localhost3306/bjpowernode";
            String user ="root";
            String password = "root";
            conn = DriverManager.getConnection(url,user,password);
            //获取预编译的数据库操作对象
            String sql  ="select job,deptno from emp";
            ps=conn.prepareStatement(sql);
            //执行sql
            rs = ps.executeQuery();

            //处理结果集
            while (rs.next()){
                String job =rs.getString("no");
                String deptno =rs.getString("name");
                out.print(job+","+deptno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
