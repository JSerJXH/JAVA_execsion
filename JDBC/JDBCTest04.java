package JDBC;

import java.sql.*;

public class JDBCTest04 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps= null;
        ResultSet re = null;



        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","jxh0529.");
            //3.获取编译的数据库操作对象
            String sql1 = "update dept set dname = ? where deptno = ?";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,"x部门");
            ps.setInt(2,30);
            //4.执行sql、
            int count = ps.executeUpdate();
            //5.输出结构
            System.out.println(count);
            //重新给占位符传值
            ps.setString(1,"y部门");
            ps.setInt(2,20);
            //4.执行sql、
             count = ps.executeUpdate();
            //5.结果
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭进程
            if (re != null) {
                try {
                    re.close();
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

        //6.关闭进程
    }
}
