package week4;

public class leet785 {

    class Solution {
        int[] colors;   // -1 blue, 1 red
        boolean isBipar = true;

        public boolean isBipartite(int[][] graph) {
            colors = new int[graph.length];

            for (int i=0; i < graph.length; i++) {
                if (!isBipar)
                    break;
                if (colors[i] == 0)
                    Bipartite(1, i, graph);
            }

            if (isBipar)
                return true;
            else
                return false;
        }

        public void Bipartite(int newColor, int node, int[][] graph) {
            colors[node] = newColor;

            for (int next : graph[node]) {
                if (colors[next] == newColor) {
                    isBipar = false;
                    return;
                }

                if (colors[next] == 0)
                    Bipartite(-newColor, next, graph);
            }

        }
    }
}
