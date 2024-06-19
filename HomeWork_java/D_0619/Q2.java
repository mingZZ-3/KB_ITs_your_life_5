package D_0619;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"샌드위치", "바게트"};
        int[] prices = {2000, 3500};
        int[] cntList = {0, 0};
        int total = 0;

        while (true) {
            System.out.print("주문할 상품을 선택하세요 (1: 샌드위치, 2: 바게트, 0: 주문 종료) : ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int index = Integer.parseInt(input) - 1;
            if (index >= products.length) {
                System.out.println("없는 상품입니다. 다시 입력해주세요 !");
                continue;
            }

            System.out.println("선택한 상품 : " + products[index]);

            System.out.print("주문할 수량을 입력하세요 : ");
            input = scanner.nextLine();
            cntList[index] = Integer.parseInt(input);
            total += prices[index] * cntList[index];

            System.out.println("< 현재 주문 상황 >");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]+ " : " + cntList[i] + "개");
            }
            System.out.println("최종 주문 가격 : " + total + "원");
        }

        // 프로그램 종류
        System.out.println("< 최종 주문 내역 >");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]+ " : " + cntList[i] + "개");
        }
        System.out.println("최종 주문 가격 : " + total + "원");
    }
}
