package boj;

import java.util.*;

public class Q2606 {

    static int n, m, count;
    static List<List<Integer>> graph = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 컴퓨터의 수
        m = sc.nextInt();   // 간선의 수

        for (int i = 0; i <= n; i++) {
            graph.add(new LinkedList<>());
        }

        int[] visit = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        visit[1] = 1;
        dfs(1, visit);
        System.out.println(count);

    }

    private static void dfs(int v, int[] visit) {
        for (int next : graph.get(v)) {
            if (visit[next] == 0) {
                visit[next] = 1;
                count++;
                dfs(next, visit);
            }
        }
    }
}
