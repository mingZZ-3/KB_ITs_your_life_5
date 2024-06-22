package D_0621;

import java.util.Scanner;

public class Q1 {
    private static final String ID = "root";
    private static final int PWD = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = "", title = "", content = "";

        while (true) {
            System.out.print("ID를 입력하세요 : ");
            String id = scanner.nextLine();
            System.out.print("비밀번호를 입력하세요 : ");
            int pwd = Integer.parseInt(scanner.nextLine());

            if (!id.equals(ID) || pwd != PWD) {
                System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
                continue;
            }
            System.out.println("일기 작성을 시작합니다.");

            System.out.print("날짜를 입력하세요 (예 : 20240622) : ");
            date = scanner.nextLine();
            System.out.print("제목을 입력하세요 : ");
            title = scanner.nextLine();
            System.out.println("내용을 입력하세요 : ");
            content = scanner.nextLine();
            System.out.println("일기가 저장되었습니다.");
            break;
        }

        System.out.println(date + ") " + title);
        System.out.println(content);
    }
}