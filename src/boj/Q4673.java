package boj;

import java.io.*;

public class Q4673 {

    static boolean[] arr;

    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        arr = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            d(i);
        }

    }

    private static void d(int n) {
        if (arr[n]) return;
        else {
            int temp = n;
            while (temp > 0) {

            }
        }
    }

}
