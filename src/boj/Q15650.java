package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q15650 {

    static int N, M;
    static int[] result;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];

        logic(1, 0);
        bw.flush();
        br.close();
        bw.close();
    }

    private static void logic(int start, int cnt) throws IOException {
        if (cnt == M) {
            for (int x : result) {
                bw.write(x + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = start; i <= N; i++) {
            result[cnt] = i;
            logic(i + 1, cnt + 1);
        }
    }

}
