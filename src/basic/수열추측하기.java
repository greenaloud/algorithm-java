package basic;

import java.util.Scanner;

public class 수열추측하기 {

    static int n, f;
    static int[] pm, mul, ch;
    static boolean flag = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();

        pm = new int[n];        // level 을 인덱스로 선택한 숫자를 저장하는 배열
        mul = new int[n];       // 조합을 구해서 저장해 두는 배열
        ch = new int[n + 1];    // 해당 숫자를 사용했으면 1을 저장하는 배열

        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            mul[i] = comb(n - 1, i, graph);
        }

        dfs(0, 0);

    }

    private static int comb(int n, int r, int[][] graph) {
        if (graph[n][r] > 0) {
            return graph[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return graph[n][r] = comb(n - 1, r - 1, graph) + comb(n - 1, r, graph);
        }
    }

    private static void dfs(int level, int sum) {
        if (flag) return;
        if (level == n) {
            if (sum == f) {
                for (int i : pm) {
                    System.out.print(i + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = i;
                    dfs(level + 1, sum + pm[level] * mul[level]);
                    ch[i] = 0;
                }
            }
        }
    }
}
