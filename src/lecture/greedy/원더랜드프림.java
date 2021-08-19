package lecture.greedy;

import java.util.*;

public class 원더랜드프림 {

    private static class Edge implements Comparable<Edge> {
        int v, w;

        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();
            graph.get(a).add(new Edge(b, w));
            graph.get(b).add(new Edge(a, w));
        }

        int[] chk = new int[n + 1];
        System.out.println(solution(graph, chk, 1));

    }

    private static int solution(List<List<Edge>> graph, int[] chk, int v) {
        int answer = 0;
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(v, 0));
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            if (chk[edge.v] == 0) {
                chk[edge.v] = 1;
                answer += edge.w;
                for (Edge e : graph.get(edge.v)) {
                    if (chk[e.v] == 0) queue.offer(new Edge(e.v, e.w));
                }
            }
        }
        return answer;
    }
}
