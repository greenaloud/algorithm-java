package boj;

import java.io.*;

public class Q2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] croat = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < 8; i++) {
            str = str.replaceAll(croat[i], " ");
        }

        System.out.println(str.length());
    }

}
