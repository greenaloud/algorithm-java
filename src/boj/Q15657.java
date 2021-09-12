package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15657 {

    static int N, M;
    static int[] nums;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        logic(0, 0, "");
        bw.flush();
        br.close();
        bw.close();
    }

    private static void logic(int idx, int cnt, String str) throws IOException {
        if (cnt == M) {
            bw.write(str);
            bw.newLine();
            return;
        }
        for (int i = idx; i < N; i++) {
            logic(i, cnt + 1, str + nums[i] + " ");
        }
    }

}
