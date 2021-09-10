package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q15650 {

    static int N, M;
    static int[] number;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());    // 자연수의 범위
        M = Integer.parseInt(st.nextToken());    // 선택할 수의 갯수

        number = new int[M];
        per(1, 0);

        System.out.println(sb);
    }

    private static void per(int start, int count) throws IOException {
        if (count == M) {
            for (int n : number) {
                sb.append(n + " ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = start; i <= N; i++) {
                number[count] = i;
                per(i + 1, count + 1);
            }
        }
    }

}
