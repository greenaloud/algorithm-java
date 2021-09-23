package boj;

import java.io.*;

public class Q1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int i;
        for (i = 1; sum < N; i++) {
            sum += i;
        }
        i--;

        int seq = N - sum + i;
        int left, right;
        if (i % 2 == 0) {
            left = seq;
            right = i - seq + 1;
        } else {
            left = i - seq + 1;
            right = seq;
        }
        System.out.println(left + "/" + right);
    }

}
