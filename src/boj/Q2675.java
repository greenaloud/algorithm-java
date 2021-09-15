package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String target = st.nextToken();
            int len = target.length();
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < repeat; j++) {
                    bw.write(target.charAt(i));
                }
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
