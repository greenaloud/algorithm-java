package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15651 {

    static int N, M;
    static char[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new char[2 * M];
        Arrays.fill(result, ' ');
        logic(0);

        System.out.println(sb);
    }

    private static void logic(int cnt) throws IOException {
        if (cnt == M) {
            sb.append(result).append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            result[2 * cnt] = (char) (i + '0');
            logic(cnt + 1);
        }
    }

}
