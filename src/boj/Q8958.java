package boj;

import java.io.*;

public class Q8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            int score = 0;
            int total = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == 'O') {
                    total += ++score;
                } else {
                    score = 0;
                }
            }
            bw.write(total + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
