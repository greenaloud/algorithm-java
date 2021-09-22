package boj;

import java.io.*;
import java.util.StringTokenizer;

public class Q1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basic = Integer.parseInt(st.nextToken());
        int per = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        if (price <= per) {
            System.out.println(-1);
            return;
        }
        System.out.println(basic / (price-per) + 1);
    }

}
