package D_0620;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Run_book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1번째
        Book b1 = new Book();
        System.out.print("책제목, 작가, isbn을 순서대로 입력 >> ");
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        b1.setTitle(st.nextToken());
        b1.setAuthor(st.nextToken());
        b1.setIsbn(st.nextToken());

        // 2번째
        Book b2 = new Book();
        System.out.print("책제목, 작가, isbn을 순서대로 입력 >> ");
        st = new StringTokenizer(scanner.nextLine());
        b2.setTitle(st.nextToken());
        b2.setAuthor(st.nextToken());
        b2.setIsbn(st.nextToken());

        System.out.println("--- 등록된 도서관 책 목록 ---");
        System.out.println(b1);
        System.out.println(b2);
    }
}
