package week12;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class pgs118667 {
    public static void main(String[] args) {
//        int result = solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2});
//        int result = solution(new int[]{1, 1}, new int[]{1, 5});
        int result = solution(new int[]{3,2,7,2}, new int[]{4,6,5,1});

        System.out.println(result);
    }

    //
    public static int solution(int[] queue1, int[] queue2) {
        int cnt = 0;
        int sum1 = Arrays.stream(queue1).sum();
        int sum2 = Arrays.stream(queue2).sum();
        int max = queue1.length * queue2.length;

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
        }
        for (int i = 0; i < queue2.length; i++) {
            q2.add(queue2[i]);
        }

        while (true) {
            if (sum1 == sum2)
                break;
            if (cnt > max) {
                cnt = -1;
                break;
            }

            if (sum1 > sum2) {
                int top = q1.poll();
                sum1 -= top;
                q2.add(top);
                sum2 += top;
            } else if (sum2 > sum1) {
                int top = q2.poll();
                sum2 -= top;
                q1.add(top);
                sum1 += top;
            }
            cnt++;
        }

        return cnt;
    }
}
