package D_0701;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("고객의 전체 리스트 :");
        List<Member> members = new ArrayList<>();
        members.add(new Member("100","김데이"));
        members.add(new Member("200","김사전"));
        members.add(new Member("300","김구조"));
        members.add(new Member("400","김자료"));

        members.remove(1);
        Member member = members.get(1);
        member.setName("김충성");
        members.forEach(System.out::println);
    }
}
