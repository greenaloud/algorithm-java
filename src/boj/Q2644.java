package boj;

import java.util.*;

public class Q2644 {

    static int n;
    static int[] visit;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        visit = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int start = sc.nextInt();
        int end = sc.nextInt();
        int m = sc.nextInt();


        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        System.out.println(bfs(start, end));

    }

    private static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int now = queue.poll();
                for (int next : graph.get(now)) {
                    if (next == end) {
                        return ++level;
                    }
                    if (visit[next] == 0) {
                        queue.offer(next);
                        visit[next] = 1;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
