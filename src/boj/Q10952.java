package boj;

import java.io.*;
import java.util.*;

public class Q10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if (sum == 0) break;
            bw.write(sum+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
