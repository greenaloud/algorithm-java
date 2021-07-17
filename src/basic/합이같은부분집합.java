package basic;

import java.util.Scanner;

public class 합이같은부분집합 {

    static int[] numbers;
    static boolean answer;
    static int n, total=0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        dfs(0, 0);
        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static void dfs(int level, int sum) {
        if (answer) {
            return;
        }
        if (level == n) {
            if (total - sum == sum) {
                answer = true;
            }
        } else {
            dfs(level + 1, sum + numbers[level]);
            dfs(level + 1, sum);
        }
    }
}
