package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int idx = s.indexOf(" ");
            sb.append(Integer.parseInt(s.substring(0, idx))+Integer.parseInt(s.substring(idx+1))+"\n");
        }

        System.out.println(sb);
    }

}
