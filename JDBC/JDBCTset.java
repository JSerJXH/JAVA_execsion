package JDBC;
/*
实现功能：
    1需求
    2业务描述

 */
public class JDBCTset {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Drriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
