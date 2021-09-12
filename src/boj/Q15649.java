package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q15649 {

    static int N, M;
    static int[] result;
    static boolean[] v;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        v = new boolean[N+1];
        result = new int[M];

        logic(0);

        bw.flush();
        br.close();
        bw.close();
    }

    private static void logic(int cnt) throws IOException {
        if (cnt == M) {
            for (int x : result) {
                bw.write(x + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (v[i]) continue;
            result[cnt] = i;
            v[i] = true;
            logic(cnt + 1);
            v[i] = false;
        }
    }

}
