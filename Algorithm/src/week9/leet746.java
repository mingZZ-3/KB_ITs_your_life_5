package week9;

import java.util.Arrays;

public class leet746 { // Min Cost Climbing Stairs
    public int solution(int[] cost) {
        int[] memo = new int[cost.length + 1]; // 최저 계단 이용금 저장
        Arrays.fill(memo, -1);
        memo[0] = 0;  // 처음에는 비용 x. 이후 돈을 지불해야 올라가는 것
        memo[1] = 0;

        for(int i=2; i<=cost.length; i++) {
            memo[i] = Math.min(memo[i-1] + cost[i-1], memo[i-2] + cost[i-2]);
        }
        return memo[cost.length];
    }
}
