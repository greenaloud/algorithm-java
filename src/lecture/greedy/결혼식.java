package lecture.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 결혼식 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ins = new int[n];
        int[] outs = new int[n];

        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            int out = sc.nextInt();
            ins[i] = in;
            outs[i] = out;
        }
        Arrays.sort(ins);
        Arrays.sort(outs);

        int lt = 0, rt = 0, count = 0, max = 0;
        while (lt < n) {
            if (ins[lt] < outs[rt]) {
                count++;
                max = Math.max(count, max);
                lt++;
            } else if (ins[lt] > outs[rt]) {
                count--;
                rt++;
            } else {
                lt++;
                rt++;
            }
        }
        System.out.println(max);
    }
}
