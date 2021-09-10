package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15651 {

    static int n, m;
    static char[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());   // 최대 자연수
        m = Integer.parseInt(st.nextToken());   // 뽑을 자연수의 갯수

        result = new char[2 * m];
        Arrays.fill(result, ' ');

        permute(0);

        System.out.println(sb);
    }

    private static void permute(int depth) {
        if (depth == m) {
            sb.append(result).append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            result[2 * depth] = (char) (i + '0');
            permute(depth + 1);
        }
    }

}
