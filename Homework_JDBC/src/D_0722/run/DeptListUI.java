package D_0722.run;

import D_0722.dept.DeptDAO;
import D_0722.dept.DeptVO;

import java.util.List;

public class DeptListUI {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();

        List<DeptVO> list = dao.selectAll();
        if (list.size() > 0) {
            for (DeptVO deptVO : list) {
                System.out.println(deptVO.toString());
            }
        } else {
            System.out.println("데이터가 없습니다.");
        }
    }
}
