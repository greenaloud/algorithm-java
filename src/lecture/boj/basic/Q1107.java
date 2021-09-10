package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1107 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] broken = new boolean[10];

        if (n != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int x =  Integer.parseInt(st.nextToken());
                broken[x] = true;
            }
        }

        int answer = Math.abs(target - 100);
        for (int i = 0; i <= 1000000; i++) {
            int channel = i;
            int count = 0;
            boolean poss = true;
            if (channel == 0) {
                if (broken[0]) poss  = false;
                else count = 1;
            }
            while (channel != 0) {
                int rem = channel % 10;
                // 고장난 숫자인 경우
                if (broken[rem]) {
                    poss = false;
                    break;
                }
                channel /= 10;
                count++;
            }
            if (!poss) continue;
            count += Math.abs(target - i);
            if (count < answer) answer = count;
        }
        System.out.println(answer);
    }

}
