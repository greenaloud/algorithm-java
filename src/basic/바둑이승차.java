package basic;

import java.util.Scanner;

public class 바둑이승차 {

    static int c, n, answer;
    static int[] weight;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        weight = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        dfs(0, 0);
        System.out.println(answer);

    }

    private static void dfs(int level, int sum) {

        if (sum > c) {
            return;
        }
        if (level == n) {
            answer = Math.max(sum, answer);
        } else {
            dfs(level + 1, sum + weight[level]);
            dfs(level + 1, sum);
        }
    }
}
