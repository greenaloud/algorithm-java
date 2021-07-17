package boj;
import java.util.*;

public class Q1260 {

    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 정점의 갯수
        int m = sc.nextInt();   // 간선의 갯수
        int v = sc.nextInt();   // 탐색을 시작할 정점의 번호
        int[] visit = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new LinkedList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            // 양방향 간선
            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        for (List<Integer> list : graph) {
            list.sort(Comparator.naturalOrder());
        }

        dfs(v, visit);
        System.out.println();
        for (int i = 0; i <= n; i++) {
            visit[i] = 0;
        }
        bfs(v, visit);

    }

    static void dfs(int v, int[] visit) {
        if (visit[v] == 1) {
            return;
        } else {
            visit[v] = 1;
            System.out.print(v + " ");
            for (int next : graph.get(v)) {
                dfs(next, visit);
            }
        }
    }

    static void bfs(int v, int[] visit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visit[v] = 1;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp + " ");
            for (int next : graph.get(temp)) {
                if (visit[next] == 0) {
                    queue.offer(next);
                    visit[next] = 1;
                }
            }
        }
    }
}
