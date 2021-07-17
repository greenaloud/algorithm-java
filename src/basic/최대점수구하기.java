package basic;

import java.util.Scanner;

public class 최대점수구하기 {

    static int n, m, answer = 0;
    static int[] scores, times;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 문제의 갯수
        m = sc.nextInt(); // 제한시간

        scores = new int[n];
        times = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            scores[i] = a;
            times[i] = b;
        }

        dfs(0, 0, 0);
        System.out.println(answer);

    }

    private static void dfs(int level, int sum, int time) {
        if (time > m) {
            return;
        }
        if (level == n) {
            answer = Math.max(sum, answer);
        } else {
            dfs(level + 1, sum + scores[level], time + times[level]);
            dfs(level + 1, sum, time);
        }
    }

}
