package boj;

import java.io.*;

public class Q1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toUpperCase().toCharArray();
        int[] count = new int[26];

        for (int i = 0; i < chArr.length; i++) {
            int idx = chArr[i] - 'A';
            count[idx]++;
        }

        int max = 0;
        int maxIndex = 0;
        boolean flag = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
                flag = false;
            } else if (count[i] == max) flag = true;
        }
        System.out.println(flag ? '?' : (char) (maxIndex + 'A'));
    }

}
