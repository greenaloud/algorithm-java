package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.parseInt(st.nextToken());
        int min = max;

        for (int i = 0; i < n-1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp < min) min = temp;
            else if (temp > max) max = temp;
        }

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }

}
