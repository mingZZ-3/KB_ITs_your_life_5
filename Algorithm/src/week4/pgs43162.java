package week4;

import java.util.*;

public class pgs43162 { // 네트워크
    class Solution {
        boolean[] visited;
        public int solution(int n, int[][] computers) {
            visited = new boolean[n];
            int cnt = 0;

            for (int i=0; i<n; i++) {
                if (visited[i]) continue;

                dfs(i, n, computers);
                cnt++;
            }

            return cnt;
        }

        public void dfs(int comp, int n, int[][] computers) {
            visited[comp] = true;
            for (int i=0; i<n; i++) {
                if (!visited[i] && computers[comp][i] == 1)
                    dfs(i, n, computers);
            }
        }
    }
}
