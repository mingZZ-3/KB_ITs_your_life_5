package week9;

import java.util.Arrays;

public class leet322 {  // Coin Change
    public int solution(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        int answer = dp(coins, amount, memo);
        return answer == Integer.MAX_VALUE? -1 : answer;
    }

    public int dp(int[] coins, int amount, int[] memo) {
        int result = Integer.MAX_VALUE;

        if (amount == 0) return 0;

        for (int coin : coins) {
            // 계산 가능한 경우의 수
            if (amount - coin >= 0) {
                if(memo[amount - coin] == Integer.MAX_VALUE) {  // 방문한 적 없음
                    memo[amount - coin] = dp(coins, amount - coin, memo);
                }
                result = Math.min(result, memo[amount - coin]);
            }
        }
        return result == Integer.MAX_VALUE? result : result + 1;
    }
}
