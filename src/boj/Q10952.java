package boj;

import java.io.*;

public class Q10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = br.readLine()) != null) {
            int x = Integer.parseInt(s.substring(0, 1));
            int y = Integer.parseInt(s.substring(2));
            bw.write((x+y) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
