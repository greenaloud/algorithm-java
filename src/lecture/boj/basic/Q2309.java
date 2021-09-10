package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;

public class Q2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        boolean flag = false;
        int target = sum - 100;
        for (int i = 0; i < 8; i++) {
            if (flag) break;
            for (int j = i + 1; j < 9; j++) {
                if (height[i] + height[j] == target) {
                    height[i] = height[j] = 0;
                    flag = true;
                    break;
                }
            }
        }

        Arrays.sort(height);
        for (int i = 2; i < 9; i++) {
            bw.write(height[i]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
