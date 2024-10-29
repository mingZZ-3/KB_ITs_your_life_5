package week14;

import java.util.Arrays;

public class Recursive06 {

    // 순열
    // 순서 o, 중복 x
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int[] sel = new int[2];
        permutation(arr, sel, 0, new boolean[arr.length]);
    }

    public static void permutation(int[] arr, int[] sel, int k, boolean[] visited) {
        // basis part
        if (k == sel.length) {
            System.out.println(Arrays.toString(sel));
            return;
        }

        // inductive part
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sel[k] = arr[i];
                permutation(arr, sel, k + 1, visited);
                visited[i] = false;
            }
        }
    }
}
