package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q6064 {

    static long MAX;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            MAX = M * N;

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(cal(M, N, x-1, y-1) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static int cal(int M, int N, int x, int y) {
        int answer = -1;

        for (int i = x; i < MAX; i += M) {
            if (i % N == y) {
                answer = i+1;
                break;
            }
        }

        return answer;
    }

}
