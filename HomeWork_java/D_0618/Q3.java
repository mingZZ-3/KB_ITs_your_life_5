package D_0618;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수학 점수를 입력하세요.");
        String str = sc.nextLine();
        int math_score1 = Integer.parseInt(str);

        System.out.println("첫번째 영어 점수를 입력하세요.");
        str = sc.nextLine();
        int eng_score1 = Integer.parseInt(str);

        System.out.println("두번째 수학 점수를 입력하세요.");
        str = sc.nextLine();
        int math_score2 = Integer.parseInt(str);

        System.out.println("두번째 영어 점수를 입력하세요.");
        str = sc.nextLine();
        int eng_score2 = Integer.parseInt(str);

        System.out.println("수학 평균 점수 : " + (float)(math_score1 + math_score2)/2);
        System.out.println("영어 평균 점수 : " + (float)(eng_score1 + eng_score2)/2);
    }
}
