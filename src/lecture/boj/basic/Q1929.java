package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        // 기본 false 소수가 아니라면 true
        boolean chk[] = new boolean[e + 1];
        chk[1] = true;

        for (int i = 2; i*i <= e; i++) {
            for (int j = i*i; j <= e; j+=i) {
                chk[j] = true;
            }
        }

        for (int i = s; i <= e; i++) {
            if (!chk[i]) bw.write(i+"\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
