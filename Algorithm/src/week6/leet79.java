package week6;

public class leet79 { // word search

    class Solution {
        int R, C;
        int[] dirR = {-1, 1, 0, 0};
        int[] dirC = {0, 0, -1, 1};
        boolean isExist = false;
        boolean[][] visited;

        public boolean exist(char[][] board, String word) {
            R = board.length;
            C = board[0].length;
            visited = new boolean[R][C];

            for (int i=0; i < R; i++) {
                for (int j=0; j < C; j++) {
                    if (board[i][j] == word.charAt(0) && !visited[i][j]) { // word의 시작과 같은 문자면
                        visited[i][j] = true;
                        dfs(board, 0, new Node(i, j), word);
                        visited[i][j] = false;
                    }

                    if (isExist) return true;
                }
            }
            return false;
        }

        public void dfs(char[][] board, int idx, Node now, String target) {
            if (idx == target.length() - 1)  {
                isExist = true;
                return;
            }

            // 상하좌우 확인
            for (int i=0; i < 4; i++) {
                int nr = now.r + dirR[i];
                int nc = now.c + dirC[i];

                if (InRange(nr, nc) && board[nr][nc] == target.charAt(idx + 1)){   // 다음 문자와 동일하면
                    if (!visited[nr][nc]){
                        visited[nr][nc] = true;
                        dfs(board, idx + 1, new Node(nr, nc), target);
                        visited[nr][nc] = false;
                    }
                }
            }
        }

        boolean InRange(int r, int c) {
            return (r >= 0) && (r < R) && (c >= 0) && (c < C);
        }

        class Node {
            int r, c;

            Node(int r, int c) {
                this.r = r;
                this.c = c;
            }
        }
    }
}
