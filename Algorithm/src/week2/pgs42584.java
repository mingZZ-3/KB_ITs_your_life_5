package week2;

import java.util.*;

public class pgs42584 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{2,1});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            q.add(prices[i]);
        }

        int idx = 0;
        while (!q.isEmpty()) {
            int price = q.poll();
            result[idx] = 0;

            for (int j = 0; j < q.size(); j++) {
                if (!q.isEmpty()) {   // 1초는 값이 유지될 수 있음
                    result[idx]++;
                    int nextPrice = q.poll();
                    q.add(nextPrice);
                    if (price > nextPrice) {    // 값이 떨어짐
                        break;
                    }
                } else {
                    break;
                }
            }

            idx++;
        }

        return result;
    }
}
