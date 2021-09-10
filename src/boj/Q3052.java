package boj;

import java.io.*;

public class Q3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        int count = 0;
        for (int i = 0; i < 10; i++) {
            int rem = Integer.parseInt(br.readLine()) % 42;
            if (!arr[rem]) {
                arr[rem] = true;
                count++;
            }
        }
        System.out.println(count);
    }

}
