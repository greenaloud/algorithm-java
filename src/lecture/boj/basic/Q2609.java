package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int gcd = gcd(x, y);
        int lcm = x * y / gcd;

        bw.write(gcd + "\n" + lcm);
        br.close();
        bw.close();
    }

    private static int gcd(int x, int y) {

        while (y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        return x;
    }

}
