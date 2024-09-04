package week11;

import java.util.*;

public class leet1514 {
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // costs 초기화
        double[] costs = new double[n];
        Arrays.fill(costs, 0);

        // graph 초기화
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i=0; i<edges.length; i++) {
            int s = edges[i][0];
            int e = edges[i][1];
            double c = succProb[i];
            graph.get(s).add(new Edge(e,c));
            graph.get(e).add(new Edge(s,c));
        }

        // 다익스트라
        Queue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(start_node,1));
        costs[start_node] = 1;
        while (!q.isEmpty()) {
            Edge now = q.poll();

            if (now.v == end_node) return now.c;

            for (Edge next : graph.get(now.v)) {
                double newCost = next.c * now.c;
                if (newCost > costs[next.v]) {
                    costs[next.v] = newCost;
                    q.add(new Edge(next.v, newCost));
                }
            }
        }

        return costs[end_node];
    }

    static class Edge implements Comparable<Edge> {
        int v;
        double c;
        public Edge(int v, double c) {
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(Edge o) {
            return Double.compare(o.c, this.c);
        }
    }
}
