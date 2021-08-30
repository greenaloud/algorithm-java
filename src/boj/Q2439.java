package boj;

import java.io.*;

public class Q2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // 행 갯수
        for (int i=1; i<=n; i++) {
            // 공백을 찍을 반복문
            for (int j=n-i; j>0; j--) {
                bw.write(" ");
            }
            // 별을 찍을 반복문
            for (int j=0; j<i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
