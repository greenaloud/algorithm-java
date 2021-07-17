package basic;

import java.util.Scanner;

public class Dfs구슬뽑기조합구하기 {

    static int n, m;
    static int[] record;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        record = new int[m];

        dfs(0, 1);

    }

    private static void dfs(int level, int start) {

        if (level == m) {
            for (int i : record) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= n; i++) {
                record[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
}
