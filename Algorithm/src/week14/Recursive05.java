package week14;

import java.util.Arrays;

public class Recursive05 {

    // 중복 순열
    // 순서 o, 중복 o
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int[] sel = new int[3];
        permutation(arr, sel, 0);
    }

    public static void permutation(int[] arr, int[] sel, int k) {
        // basis part
        if (k == arr.length) {
            System.out.println(Arrays.toString(sel));
            return;
        }

        // inductive part
        for (int i = 0; i < arr.length; i++) {
            sel[k] = arr[i];
            permutation(arr, sel, k + 1);
        }
    }
}
