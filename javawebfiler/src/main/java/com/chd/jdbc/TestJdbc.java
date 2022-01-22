package com.chd.jdbc;

import java.sql.*;

/**
 * @Author Big_Sea
 * @Date 2022/1/13 10:05
 * @Version 1.0
 */
public class TestJdbc {
  public static void main(String[] args)  {
    //连接数据库JDBC
    Connection conn = null;
    PreparedStatement ps= null;
    ResultSet rs=null;
    try {
      //注册驱动
      Class.forName("com.mysql.jdbc.Driver");
      //获取连接
      String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
      String user="root";
      String password="root";
      conn = DriverManager.getConnection(url,user,password);
      //获取预编译的数据库操作对象
      String sql="select * from users ";
      ps = conn.prepareStatement(sql);

      //执行SQL
      rs= ps.executeQuery();
      //处理结果集
      while (rs.next()){
        System.out.println(rs.getString("name"));

      }
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      //释放资源
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
}}
