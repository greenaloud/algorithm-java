package boj;

import java.util.*;
import java.io.*;

public class Q10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int bar = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (target < bar) bw.write(target + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
