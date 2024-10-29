package week14;

public class Recursive01 {
    // 1 ~ 5까지 찍는 프로그램을 작성해보세요.
    public static void main(String[] args) {
        recursive01(1);
    }

    public static void recursive01(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        recursive01(n+1);
    }
}
