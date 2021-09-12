package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15655 {

    static int n, m;
    static int[] arr;
    static int[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];
        Arrays.fill(result, ' ');

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        sb = new StringBuilder();
        permute(0, 0);

        System.out.println(sb);
    }

    private static void permute(int idx, int depth) {
        if (depth == m) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = idx; i < n; i++) {
            result[depth] = arr[i];
            permute(i + 1, depth + 1);
        }
    }

}
