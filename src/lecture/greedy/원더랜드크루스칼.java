package lecture.greedy;

import java.util.*;

public class 원더랜드크루스칼 {

    static int[] unf;

    static class Edge implements Comparable<Edge> {
        int v1, v2, cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        unf = new int[n + 1];
        for (int i = 0; i <= n; i++) unf[i] = i;
        List<Edge> graph = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            graph.add(new Edge(v1, v2, cost));
        }
        Collections.sort(graph);

        int answer = 0;
        for (Edge e : graph) {
            int f1 = find(e.v1);
            int f2 = find(e.v2);
            if (f1 != f2) {
                union(e.v1, e.v2);
                answer += e.cost;
            }
        }
        System.out.println(answer);

    }

    private static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

}
