package D_0619;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] movieNmList = {"코난", "인사이드아웃3", "설계자", "매드맥스", "블랙북"};
        int[] views = {15000, 23000, 18000, 21000, 19000};

        System.out.println("네이버 시리즈온 실시간 영화 목록");
        for (int i = 0; i < movieNmList.length; i++) {
            System.out.println(i+1 + ". " + movieNmList[i] + " - 조회수 : " + views[i] + "회");
        }
        System.out.println();

        System.out.print("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5) : ");
        String str = sc.nextLine();
        int index = Integer.parseInt(str) - 1;

        System.out.println("선택한 영화 : " + movieNmList[index]);
        System.out.println("조회수 : " + views[index]);
    }
}
