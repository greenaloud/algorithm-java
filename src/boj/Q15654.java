package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15654 {

    static int N, M;
    static int[] numbers;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        result = new int[M];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        logic(0);
        System.out.println(sb);
    }

    private static void logic(int cnt) {
        if (cnt == M) {
            for (int x : result) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visit[i]) continue;
            result[cnt] = numbers[i];
            visit[i] = true;
            logic(cnt + 1);
            visit[i] = false;
        }
    }

}
