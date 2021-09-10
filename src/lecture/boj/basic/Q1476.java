package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1476 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken())-1;
        int s = Integer.parseInt(st.nextToken())-1;
        int m = Integer.parseInt(st.nextToken())-1;

        int year;
        for (year = 0; ; year++) {
            if (year%15 == e && year%28 == s && year%19 == m) break;
        }

        System.out.println(year+1);
    }

}
