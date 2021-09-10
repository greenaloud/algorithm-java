package lecture.boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15652a {

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
        for (int i = m-count; i >= 1; i--) {
            for (int j = i-1; j >= count; j -= 2) {
                chars[2 * j] = (char) (index + '0');
            }
            select(index + 1, count + i);
        }
        select(index + 1, count);
    }

}
