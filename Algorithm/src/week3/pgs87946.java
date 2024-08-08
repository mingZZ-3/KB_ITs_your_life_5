package week3;

public class pgs87946 {
    public static void main(String[] args) { // 피로도
        int result = solution(80, new int[][] {{80,20},{50,40},{30,10}});
        System.out.println(result);
    }

    static boolean[] visited;
    static int cnt;

    private static int solution(int k, int[][] dungeons) {
        cnt = 0;
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return cnt;
    }

    private static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > k) {
                continue;
            }
            visited[i] = true;
            dfs(depth + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        cnt = Math.max(cnt, depth);
    }
}