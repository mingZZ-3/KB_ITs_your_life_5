package D_0722.dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
    public static String driverClass = "com.mysql.cj.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/school2";
    public static String user = "root";
    public static String password = "a6857754";
    private Connection conn = null;

    public DeptDAO() {
        try {
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DeptVO selectOne(int no) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "select * from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                int deptno = rs.getInt("deptno");
                String name = rs.getString("dname");
                String loc = rs.getString("loc");

                return new DeptVO(deptno, name, loc);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (pstmt != null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    public List<DeptVO> selectAll() {
        List<DeptVO> list = new ArrayList<DeptVO>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "select * from dept";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String name = rs.getString("dname");
                String loc = rs.getString("loc");
                list.add(new DeptVO(deptno, name, loc));
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (pstmt != null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
