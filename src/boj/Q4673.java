package boj;

import java.io.*;

public class Q4673 {

    static boolean[] self;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        self = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            if (!self[i]) logic(i);
        }

        for (int i = 1; i <= 10000; i++) {
            if (!self[i]) bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void logic(int n) {
        if (n > 10000) return;
        else {
            int sum = n;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum <= 10000 && !self[sum]) {
                self[sum] = true;
                logic(sum);
            }
        }
    }

}
