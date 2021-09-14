package boj;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q15663 {

    static int N, M;
    static int[] nums;
    static boolean[] visit;
    static HashSet<String> set = new HashSet<>();
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        logic(0, "");
        bw.flush();
        br.close();
        bw.close();
    }

    private static void logic(int cnt, String str) throws IOException {
        if (cnt == M) {
            if (set.contains(str)) return;
            set.add(str);
            bw.write(str);
            bw.newLine();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visit[i]) continue;
            visit[i] = true;
            logic(cnt + 1, str + nums[i] + " ");
            visit[i] = false;
        }
    }

}
