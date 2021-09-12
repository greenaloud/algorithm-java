package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q14501 {

    static int N, answer = 0;
    static int[] t, p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        t = new int[N];
        p = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        logic(0, 0);
        System.out.println(answer);
    }

    private static void logic(int day, int sum) {
        if (day > N) {
            return;
        }
        if (day == N) {
            answer = Math.max(sum, answer);
            return;
        }
        logic(day + 1, sum);
        logic(day + t[day], sum + p[day]);
    }

}
