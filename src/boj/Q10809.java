package boj;

import java.io.*;

public class Q10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chArr = br.readLine().toCharArray();

        int[] index = new int[26];
        for (int i = 0; i < 26; i++) {
            index[i] = -1;
        }

        for (int i = 0; i < chArr.length; i++) {
            int x = chArr[i] - 'a';
            if (index[x] == -1) index[x] = i;
        }

        for (int idx : index) {
            bw.write(idx + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
