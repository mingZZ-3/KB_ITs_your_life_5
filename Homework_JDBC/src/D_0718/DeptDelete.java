package D_0718;

import java.sql.*;
import java.util.Scanner;

public class DeptDelete {
    public static Connection conn = null;
    public static PreparedStatement pstmt = null; // ★★★★★
    public static ResultSet rs = null;

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
            conn.setAutoCommit(false);

            delete();

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (pstmt != null && !pstmt.isClosed()) {
                    pstmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
                System.out.println("삽입 성공");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void delete() throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("deptno >> ");
        int deptNo = Integer.parseInt(sc.nextLine());

        String sql = "delete from dept where deptno = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, deptNo);

        int result = pstmt.executeUpdate();

        if (result > 0) {
            System.out.println("delete 성공!");
        } else {
            System.out.println("delete 실패.");
        }
        System.out.println("delete 종료\n");
    }
}
