package week14;

public class Recursive02 {
    // 1 - 5를 더하는 프로그램을 재귀로 작성해줘
    public static void main(String[] args) {
        recursive02(1, 0);
    }

    public static void recursive02(int idx, int sum) {
        // basis part
        if (idx > 5)
            return;

        // inductive part
        sum += idx;
        System.out.println(sum);
        recursive02(idx + 1, sum);
    }
}
