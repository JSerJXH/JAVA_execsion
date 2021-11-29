package JDBC;

public class JDBCTset {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Drriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
