package week10;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class pgs42586 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1,1,1,1,1,1});
//        int[] result = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static  int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < progresses.length; i++) {
            int workday = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0)
                workday++;
            q.add(workday);
        }

        int idx = 0;
        while (!q.isEmpty()) {
            int workday = q.poll();
            answer[idx] = 1;

            if (q.isEmpty()) {
                idx++;
                break;
            }

            while (!q.isEmpty()) {
                if (workday >= q.peek()) {
                    q.poll();
                    answer[idx]++;
                } else {
                    break;
                }
            }
            idx++;
        }

        return Arrays.copyOf(answer, idx);
    }
}
