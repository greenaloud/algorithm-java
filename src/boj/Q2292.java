package boj;

import java.io.*;

public class Q2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());

        int num = 1;
        int multiply = 1;
        while (target > num) {
            num += multiply++ * 6;
        }

        System.out.println(multiply);
    }

}
