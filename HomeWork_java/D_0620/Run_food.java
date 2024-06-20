package D_0620;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run_food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Food[] menus = new Food[3];
        List<Food> myPick = new ArrayList<>();
        menus[0] = new Food("Burger", 5.99);
        menus[1] = new Food("Fries", 2.99);
        menus[2] = new Food("Soda", 1.99);

        while (true) {
            System.out.println();
            System.out.print("메뉴 번호를 입력, 3개 모두 주문 완료 되었으면 'x' 입력 >> ");
            String input = sc.nextLine();

            if (input.equals("x")) {
                if (myPick.size() < 3) {
                    System.out.println("메뉴를 3개 골라야 합니다.");
                    continue;
                }
                break;
            }

            if (myPick.size() >= 3) {
                System.out.println("3개를 모두 골랐습니다.");
                break;
            }

            if (input.equals("1")) {
                myPick.add(menus[0]);
            } else if (input.equals("2")) {
                myPick.add(menus[1]);
            } else if (input.equals("3")) {
                myPick.add(menus[2]);
            } else {
                System.out.println("없는 메뉴 입니다.");
                continue;
            }

            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("======================");
            for (int i = 0; i < menus.length; i++) {
                System.out.println(i + ">> " + menus[i].toString());
            }
        }

        System.out.println();
        System.out.println("your order : ");
        for (Food food : myPick) {
            System.out.println(food.toString());
        }
    }
}