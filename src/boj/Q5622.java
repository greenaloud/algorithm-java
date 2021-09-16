package boj;

import java.io.*;

public class Q5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();
        // 각 인덱스 번호에 해당하는 다이얼을 돌릴 때 걸리는 시간
        int[] time = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // A 를 0이라고 했을 때 Z 까지 각 알파벳에 해당하는 숫자
        int[] alphaToNum = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};

        int answer = 0;
        for (char c : chs) {
            answer += time[alphaToNum[c - 'A']];
        }

        System.out.println(answer);
    }

}
