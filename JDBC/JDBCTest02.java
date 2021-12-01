package JDBC;

import javax.swing.plaf.nimbus.State;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest02 {
    public static void main(String[] args) {
        //打标记
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入desc或者asc，desc表示降序，asc表示升序");
//        System.out.println("请输入：");
//        String result =s.nextLine();
        //JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","jxh0529.");
            //3.获取数据库操作对象
            stmt= conn.createStatement();
            //4.执行sql
            String sql = "select  avg(sal) as avgsal from emp group by deptno";
            re = stmt.executeQuery(sql);
            //5.处理结果集
            while (re.next()){
                System.out.println(re.getString("sal"));
            }




        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            if (re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
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



}
