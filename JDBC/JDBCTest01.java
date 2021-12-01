package JDBC;

import javax.swing.plaf.nimbus.State;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest01 {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String,String> uesrLonginInfo =initUI();
        //验证用户名，密码
        boolean loginSuccse = login(uesrLonginInfo);
        System.out.println(loginSuccse ? "登录成功" :"登录失败");

    }

    /**
     * 用户登录
     * @param uesrLonginInfo 用户登录信息
     * @return false表示失败，true表示成功
     *
     */
    private static boolean login(Map<String, String> uesrLonginInfo) {
        //打标记
        boolean loginSucces = false;
        //JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.jc.Driver");
            //2.获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bipowernode","root","jxh0529.");
            //3.获取数据库操作对象
            stmt= conn.createStatement();
            //4.执行sql
            String sql = "select * from t_user where username = '"+uesrLonginInfo.get("username")+"' and password = '"+uesrLonginInfo.get("password")+"'";
            re = stmt.executeQuery(sql);
            //5.处理结果集
           if(re.next()){
               loginSucces = true;

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




        return loginSucces ;
    }

    /**
     * 初始化用户界面
     * @return 用户输入的用户名和密码
     */
    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名：");
        String username = s.nextLine();

        System.out.println("密码");
        String password = s.nextLine();

        HashMap<String, String> userLoginInfo = new HashMap<>();

        userLoginInfo.put("username",username);
        userLoginInfo.put("password",password);

        return userLoginInfo;
    }


}
