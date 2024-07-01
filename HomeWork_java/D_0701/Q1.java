package D_0701;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        // 달리기
        List<String> playerList = new ArrayList<>(List.of("박소정", "김경민", "소지현", "김개빈"));
        System.out.println("초기 참가자 목록 : " + playerList);
        playerList.remove(1);
        System.out.println("탈락 후 참가자 목록 : " + playerList);

        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(i+1 + "등: " + playerList.get(i));
        }

        // 시험
        List<String> testList = new ArrayList<>(List.of("국어", "수학", "영어", "컴퓨터"));
        System.out.println("시험 볼 과목 : " + testList);

        for (int i = 1; i < testList.size(); i++) {
            System.out.println(i + "회차 시험을 한 남은 과목 : " + testList.subList(i, testList.size()));
        }

    }
}
