package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        //不要ResResultSet 因为不是查询，不需要结果
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","jxh0529.");
            //3.获取预编译的数据库操作对象
            //预编译先写sql语句，
            /**
             * 插入新的内容
             */
            /*String sql = "insert into dept (deptno,dname,loc) value(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,60);
            ps.setString(2,"销售部");
            ps.setString(3,"上海");*/

            /**
             * 更新数据
             */
            /*String sql = "update dept set dname = ?, loc = ? where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"研发一部");
            ps.setString(2,"北京");
            ps.setInt(3,60);*/
            /**
             * 删除数据
             */
            String sql = "delete from dept where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,60);

            //4.执行SQL
            int count = ps.executeUpdate();
            System.out.println(count);
            //5.获取结果，这里不需要这一步while(re.next()){System.out.println(re.getString("xxxxx"))}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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
