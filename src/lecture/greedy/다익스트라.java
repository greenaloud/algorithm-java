package lecture.greedy;

import java.util.*;

public class 다익스트라 {

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
        int n = sc.nextInt();   // 정점의 수
        int m = sc.nextInt();   // 간선의 수

        // 정점간의 간선 정보를 저장할 graph List
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 해당 간선까지의 최단거리를 저장할 distance 배열
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // graph 초기화
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(s).add(new Edge(v, w));
        }

        solution(graph, dist, 1);

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " : " + (dist[i] == Integer.MAX_VALUE ? "impossible" : dist[i]));
        }

    }

    private static void solution(List<List<Edge>> graph, int[] dist, int v) {

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(v, 0));
        dist[v] = 0;
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            int curV = edge.v;
            int curW = edge.w;
            if (curW > dist[curV]) continue;    // 다른 정점에서 가중치가 더 낮은 루트를 이미 찾은 경우 의미없는 연산을 없애기 위함
            for (Edge e : graph.get(curV)) {
                if (dist[e.v] > curW + e.w) {
                    dist[e.v] = curW + e.w;
                    queue.offer(new Edge(e.v, dist[e.v]));
                }
            }
        }

    }
}