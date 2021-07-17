package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {

    static int n, m, answer = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        m = sc.nextInt();

        dfs(0, 0, coins);
        System.out.println(answer);
    }

    private static void dfs(int level, int sum, Integer[] coins) {
        if (sum > m) {
            return;
        }
        if (level >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, level);
        } else {
            for (int coin : coins) {
                dfs(level + 1, sum + coin, coins);
            }
        }
    }

}
