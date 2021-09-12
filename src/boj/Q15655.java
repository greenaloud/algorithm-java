package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15655 {

    static int N, M;
    static int[] numbers;
    static int[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        sb = new StringBuilder();
        logic(0, 0);
        System.out.println(sb);
    }

    private static void logic(int idx, int cnt) {
        if (cnt == M) {
            for (int x : result) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = idx; i < N; i++) {
            result[cnt] = numbers[i];
            logic(i + 1, cnt + 1);
        }
    }

}
