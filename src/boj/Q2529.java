package boj;

import java.io.*;

public class Q2529 {

    static int K;
    static String max = String.valueOf(Long.MIN_VALUE), min = String.valueOf(Long.MAX_VALUE);
    static String comp;
    static int[] result;
    static boolean[] used = new boolean[10];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        K = Integer.parseInt(br.readLine());
        result = new int[K];
        comp = br.readLine().split(" ").toString();

        System.out.println(max);
        System.out.println(min);
    }

    private static void logic(int start, int end, int cnt, String str) {

        if (cnt == K + 1) {
            if (min.length() == 0) {
                min = str;
            } else {
                max = str;
            }
            return;
        }
        for (int i = start; i <= end; i++) {
            if (used[i]) continue;
            used[i] = true;

            used[i] = false;
        }

    }

}
