package basic;

import java.util.Scanner;

public class 조합수 {

    static int[][] graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        graph = new int[n+1][n+1];

        System.out.println(dfs(n, r));

    }

    private static int dfs(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            if (graph[n][r] > 0) {
                return graph[n][r];
            }
            return graph[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
}
