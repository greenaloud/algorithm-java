package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15650a {

    static int n, m;
    static char[] chars;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());   // 최대 자연수
        m = Integer.parseInt(st.nextToken());   // 뽑을 자연수의 갯수

        chars = new char[2 * m];
        Arrays.fill(chars,' ');

        per(1, 0);

        System.out.println(sb);
    }

    private static void per(int start, int depth) {
        if (depth == m) {
            sb.append(chars).append("\n");
        } else {
            for (int i = start; i <= n; i++) {
                chars[2 * depth] = (char) (i + '0');
                per(start + 1, depth + 1);
            }
        }
    }

}
