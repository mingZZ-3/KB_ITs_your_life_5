package D_0625;

import javax.swing.*;
import java.util.Scanner;

public class Q2_BankApplication {
    private static Account[] accounts = new Account[3];
    private static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    private static boolean checkAccount = false;
    private static boolean checkFindAccount = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택 > ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                addAccount();
                if (checkAccount) {
                    System.out.println("결과 : 계좌가 생성되었습니다.");
                } else {
                    System.out.println("결과 : 계좌를 생성하기 위한 정보가 부족합니다.");
                }
                checkAccount = false;
            } else if (choice == 2) {
                printAccounts();
            } else if (choice == 3) {
                addBalance();
                if (checkFindAccount) {
                    System.out.println("결과 : 입금이 성공되었습니다.");
                } else {
                    System.out.println("결과 : 없는 계좌번호 입니다.");
                }
                checkFindAccount = false;
            } else if (choice == 4) {
                withdrawBalance();
                if (checkFindAccount) {
                    System.out.println("결과 : 출금이 성공되었습니다.");
                } else {
                    System.out.println("결과 : 없는 계좌번호 입니다.");
                }
                checkFindAccount = false;
            } else if (choice == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }

    public static void addAccount() {
        System.out.println("--------");
        System.out.println("계좌 생성");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("계좌주 : ");
        String name = scanner.nextLine();
        System.out.print("초기입금액 : ");
        double balance = Double.parseDouble(scanner.nextLine());

        if (accountNumber.length() <= 3 || name.length() <= 0) {
            checkAccount = false;
        } else {
            checkAccount = true;
            accounts[count] = new Account(name, balance, accountNumber);
            count++;
        }
    }

    public static void printAccounts() {
        System.out.println("--------");
        System.out.println("계좌 목록");
        System.out.println("--------");

        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }

    public static void addBalance() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("예금액 : ");
        double balance = Double.parseDouble(scanner.nextLine());

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            checkFindAccount = false;
        } else {
            checkFindAccount = true;
            accounts[index].addBalance(balance);
        }
    }

    public static void withdrawBalance() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("출금액 : ");
        double balance = Double.parseDouble(scanner.nextLine());

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            checkFindAccount = false;
        } else {
            checkFindAccount = true;
            accounts[index].withdrawBalance(balance);
        }
    }
}
