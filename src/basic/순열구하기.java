package basic;

import java.util.Scanner;

public class 순열구하기 {

    static int n, m;
    static int[] arr, ch, pm;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pm = new int[m];
        ch = new int[n];
        dfs(0);

    }

    private static void dfs(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    dfs(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
