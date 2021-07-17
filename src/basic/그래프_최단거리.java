package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리 {

    static int n, m;
    static int[] ch, dist;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ch = new int[n + 1];
        dist = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        bfs(1);
        for (int i = 2; i < n + 1; i++) {
            System.out.println(i + " : " + dist[i]);
        }

    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dist[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dist[nv] = dist[cv] + 1;
                }
            }
        }
    }

}
