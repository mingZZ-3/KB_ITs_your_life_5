package D_0703;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("어떤 객체를 생성하시겠습니까? (Apple, Banana, Ice): ");
            String input = scanner.nextLine();
            if(input.equals("Apple")) {
                Apple apple = (Apple) Factory.createFood(ObjectType.APPLE, input);
                printInput(input);
            } else if(input.equals("Banana")) {
                Banana banana = (Banana) Factory.createFood(ObjectType.BANANA, input);
                printInput(input);
            } else if(input.equals("Ice")) {
                Ice ice = (Ice) Factory.createFood(ObjectType.ICE, input);
                printInput(input);
            } else if(input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("없는 객체입니다. 다시 입력해주세요.");
            }
            System.out.println();
        }
    }

    public static void printInput(String food) {
        System.out.println(food + "가(이) 입력되었습니다.");
    }
}
