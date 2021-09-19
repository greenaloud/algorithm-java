package boj;

import java.io.*;

public class Q1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            char[] alphas = br.readLine().toCharArray();
            if(check(alphas)) answer++;
        }

        System.out.println(answer);
    }

    private static boolean check(char[] alphas) {
        boolean[] used = new boolean[26];

        for (int i = 0; i < alphas.length; i++) {
            if (i > 0 && alphas[i] == alphas[i-1]) continue;
            int idx = alphas[i] - 'a';
            if (used[idx]) return false;
            used[idx] = true;
        }

        return true;
    }

}
