package boj;

import java.io.*;

public class Q1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals(" ")) {
            System.out.println(0);
            return;
        }

        char[] chs = str.toCharArray();
        int answer = 1;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == ' ' && i != 0 && i != chs.length-1) answer++;
        }

        System.out.println(answer);
    }

}
