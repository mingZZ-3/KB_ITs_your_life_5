package D_0722.run;

import D_0722.dept.DeptDAO;
import D_0722.dept.DeptVO;

import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();
        Scanner sc = new Scanner(System.in);
        System.out.print("deptNo>> ");

        DeptVO dapt = dao.selectOne(sc.nextInt());
        System.out.println(dapt);
    }
}
