package D_0618;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요 : ");
        String str = sc.nextLine();
        String trip_location = str;

        System.out.print("1인당 경비를 입력하세요 : ");
        str = sc.nextLine();
        float budget = Float.parseFloat(str);

        System.out.print("여행 인원을 입력하세요 : ");
        str = sc.nextLine();
        int n = Integer.parseInt(str);

        System.out.print("할인율(%)을 입력하세요 : ");
        str = sc.nextLine();
        float discount_percentage = Float.parseFloat(str);

        System.out.print("VIP 여부 (true/false)를 입력하세요 : ");
        str = sc.nextLine();
        boolean isVip = Boolean.parseBoolean(str);
        int vip_discount = isVip ? 5 : 0;

        System.out.print("당부의 말을 입력하세요 : ");
        str = sc.nextLine();
        String comment = str;

        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역 : " + trip_location);
        System.out.println("1인당 경비 : " + budget + "원");
        System.out.println("여행 인원 : " + n +"명");
        System.out.println("기본 할인율 : " + discount_percentage + "%");
        System.out.println("VIP 추가 할인율 : " + vip_discount + "%");
        System.out.println("최종 할인율 : " + (discount_percentage + vip_discount) + "%");
        System.out.println("총 경비 : " + (budget * n) + "원");
        System.out.println("할인 금액 : " + ((budget * n)*(discount_percentage + vip_discount)/100) + "원");
        System.out.println("할인 후 총 경비 : " + ((budget * n) - ((budget * n)*(discount_percentage + vip_discount)/100)) + "원");
        System.out.println("당부의 말 : " + comment);
    }
}
