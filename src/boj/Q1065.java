package boj;

import java.io.*;

public class Q1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[3];

        if (N < 100) {
            System.out.println(N);
        } else {
            int answer = 99;
            for (int i = 111; i <= N; i++) {
                nums[0] = i/100;
                nums[1] = i/10%10;
                nums[2] = i%10;
                if (nums[0] - nums[1] == nums[1] - nums[2]) answer++;
            }
            System.out.println(answer);
        }


    }

}
