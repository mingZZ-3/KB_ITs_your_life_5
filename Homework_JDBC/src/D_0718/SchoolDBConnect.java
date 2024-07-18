package D_0718;

import java.sql.*;

public class SchoolDBConnect {
    public static Connection conn = null;

    public static String driverClass = "com.mysql.cj.jdbc.Driver";
    public static String url = "jdbc:mysql://127.0.0.1:3306/school2"; // 127.0.0.1 = loofback IP, 3306 = 포트주소
    public static String user = "root";
    public static String password = "a6857754";

    public static void main(String[] args) {
        try {
            Class.forName(driverClass);
            System.out.println("1. 드라이버 등록 성공!");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("2. DB 접속 및 로그인 성공!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("6. Close 성공!");
        }
    }
}
