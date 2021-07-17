package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {

    static int n, m, answer = 0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        dfs(1);
        System.out.println(answer);

    }

    private static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    dfs(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}
