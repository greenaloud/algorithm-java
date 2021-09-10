package lecture.boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15650b {

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

        select(1, 0);

        System.out.println(sb);
    }

    private static void select(int index, int count) {
        if (count == m) {
            sb.append(chars).append("\n");
            return;
        }
        if (index > n) return;
        chars[2 * count] = (char) (index + '0');
        select(index + 1, count + 1);
        select(index + 1, count);
    }

}
