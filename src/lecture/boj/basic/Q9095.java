package lecture.boj.basic;

import java.io.*;

public class Q9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i <= 10; i++) {
            d[i] = d[i-1] + d[i-2] + d[i-3];
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int target = Integer.parseInt(br.readLine());
            bw.write(d[target] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
