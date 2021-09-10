package lecture.boj.basic;

import java.io.*;

public class Q17425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] idx = new int[T];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < T; i++) {
            idx[i] = Integer.parseInt(br.readLine());
            if (idx[i] > max) max = idx[i];
        }

        long[] d = new long[max + 1];
        for (int i = 1; i <=max ; i++) {
            d[i] = 1;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = 1; j*i <= max; j++) {
                d[i*j] += i;
            }
        }

        long[] s = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            s[i] = s[i-1] + d[i];
        }

        for (int x : idx) {
            bw.write(s[x]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
