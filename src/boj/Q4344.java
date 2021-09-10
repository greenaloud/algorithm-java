package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];

            int sum = 0;
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[j] = temp;
                sum += temp;
            }
            float avg = (float) sum / m;

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) count++;
            }
            bw.write(String.format("%.3f", (float) count * 100 / m) + "%\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
