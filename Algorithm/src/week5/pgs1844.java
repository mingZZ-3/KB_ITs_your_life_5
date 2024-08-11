package week5;

import java.util.*;

public class pgs1844 { // 게임 맵 최단거리

    class Solution {
        int n, m;
        boolean[][] visited;

        public int solution(int[][] maps) {
            n = maps.length;
            m = maps[0].length;
            visited = new boolean[n][m];

            return BFS(maps);
        }

        // 상하좌우
        int[] dirR = {-1, 1, 0, 0};
        int[] dirC = {0, 0, -1, 1};

        int BFS(int[][] maps) {
            Queue<int[]> que = new ArrayDeque<>();
            que.add(new int[]{0, 0, 1});
            visited[0][0] = true;

            while(!que.isEmpty()) {
                int[] now = que.remove();

                if (now[0] == n-1 && now[1] == m-1) {
                    return now[2];
                }

                for (int i=0; i < 4; i++) {
                    int nr = now[0] + dirR[i];
                    int nc = now[1] + dirC[i];

                    if (InRange(nr, nc) && maps[nr][nc] == 1) {
                        if (!visited[nr][nc]) {
                            visited[nr][nc] = true;
                            que.add(new int[]{nr, nc, now[2] + 1});
                        }
                    }
                }
            }
            return -1;
        }

        boolean InRange(int r, int c) {
            return (r >= 0) && (r < n) && (c >= 0) && (c < m);
        }
    }
}
