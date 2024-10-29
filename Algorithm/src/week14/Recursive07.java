package week14;

public class Recursive07 {

    // 부분 집합
    // 순서 x, 중복 x
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        boolean[] sel = new boolean[arr.length];
        poserSet(0, 0, arr, sel);
    }

    public static void poserSet(int idx, int k, int[] arr, boolean[] sel) {
        if (idx == arr.length) {
            for (int i = 0; i < sel.length; i++) {
//                if (k == 2) {   // 조합의 개수 조건
                    if (sel[i]) {
                        System.out.print(arr[i]+ " ");
                    }
//                }
            }
            System.out.println();
            return;
        }

        sel[idx] = true;
        poserSet(idx+1, k+1, arr, sel);

        sel[idx] = false;
        poserSet(idx+1, k, arr, sel);
    }
}
