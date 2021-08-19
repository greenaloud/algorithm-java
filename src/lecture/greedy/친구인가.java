package lecture.greedy;

import java.util.*;

public class 친구인가 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 학생의 수
        int m = sc.nextInt();   // 친구인 두 학생의 번호쌍 갯수

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        boolean[] friend = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int s = sc.nextInt();
        int e = sc.nextInt();

        solution(graph, friend, s);
        System.out.println(friend[e] ? "YES" : "NO");

    }

    private static void solution(List<List<Integer>> graph, boolean[] friend, int v) {

        Queue<Integer> queue = new LinkedList<>();
        friend[v] = true;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int curV = queue.poll();
            for (int next : graph.get(curV)) {
                if (!friend[next]) {
                    friend[next] = true;
                    queue.offer(next);
                }
            }
        }

    }

}
