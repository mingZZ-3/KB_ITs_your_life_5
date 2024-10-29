package week14;

import java.util.Arrays;

public class Recursive04 {

    static int[] arr = {1,3,5};
    static int[] sel = new int[2];
    // 조합
    // 순서 x, 중복 x
    public static void main(String[] args) {
        combination(0, 0);
    }

    /*
    * @param idx : 원본배열의 인덱스 변수
    * @param k : 담을 배열의 인덱스 변수
    * */
    public static void combination(int idx, int k) {
        // basis part
        if (sel.length == k) {
            // 담을 배열에 값이 다 찼음
            System.out.println(Arrays.toString(sel));
            return;
        }
        if (arr.length == idx) {
            // 더이상 원본배열에 고를 값이 없음
            return;
        }

        // inductive part
        // 담는 경우
        sel[k] = arr[idx];
        combination(idx+1, k+1);
        // 안담는 경우
        combination(idx+1, k);
    }
}
