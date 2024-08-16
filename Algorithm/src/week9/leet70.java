package week9;

import java.util.Arrays;

public class leet70 {   // Climbing Stairs

    public int solution(int n) {
        int[] stairs = new int[n+1];
        Arrays.fill(stairs, -1);
        stairs[1] = 1;
        stairs[2] = 2;

        int answer = dp(n, stairs);
        return answer;
    }

    public int dp(int n, int[] stairs) {
        if (stairs[n] == -1) {
            stairs[n] = dp(n - 1, stairs) + dp(n - 2, stairs);
        }
        return stairs[n];
    }
}
