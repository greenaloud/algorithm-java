package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        float max = Float.MIN_VALUE;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            float f = Float.parseFloat(st.nextToken());
            if (f > max) max = f;
            sum += f;
        }

        System.out.println(sum/max*100/n);
    }

}
