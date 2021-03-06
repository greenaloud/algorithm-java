package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15654 {

    static int n, m;
    static int[] arr;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];
        Arrays.fill(result, ' ');

        visit = new boolean[n];
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        sb = new StringBuilder();
        permute(0);

        System.out.println(sb);
    }

    private static void permute(int depth) {
        if (depth == m) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visit[i]) continue;
            result[depth] = arr[i];
            visit[i] = true;
            permute(depth + 1);
            visit[i] = false;
        }
    }

}
