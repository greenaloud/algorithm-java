package lecture.greedy;

import java.util.Scanner;

public class 친구인가2 {

    static int[] unf;

    private static int find(int x) {
        if (x == unf[x]) return x;
        else return unf[x] = find(unf[x]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 학생의 수
        int m = sc.nextInt();   // 친구인 두 학생의 번호쌍 갯수

        unf = new int[n + 1];
        for (int i = 0; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        int s = sc.nextInt();
        int e = sc.nextInt();
        int fs = find(s);
        int fe = find(e);
        System.out.println(fs == fe ? "YES" : "NO");

    }

}
