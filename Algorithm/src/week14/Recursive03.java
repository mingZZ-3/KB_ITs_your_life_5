package week14;

public class Recursive03 {

    // 1 - 5까지 더하고 재귀함수를 구하세요. 단, 인자는 2개만 사용
    public static void main(String[] args) {
        recursive(1,1);
    }

    private static void recursive(int idx, int val) {
        if (idx > 3) {
            System.out.println("val : " + val);
            return;
        }
        recursive(idx+1, val+idx);
        recursive(idx+1, val*idx);
    }
}
