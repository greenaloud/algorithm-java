package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1978 {

    private static boolean isPrime(int x) {
        if (x == 1) return false;
        else if (x == 2) return true;
        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        while (n-- > 0) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }

        System.out.println(count);
    }

}
