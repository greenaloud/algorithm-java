package boj;

import java.io.*;

public class Q2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > max) {
                max = n;
                idx = i+1;
            }
        }

        bw.write(max + "\n" + idx);
        bw.flush();
        br.close();
        bw.close();
    }

}
