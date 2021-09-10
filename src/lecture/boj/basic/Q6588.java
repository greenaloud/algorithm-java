package lecture.boj.basic;

import java.io.*;
import java.util.ArrayList;

public class Q6588 {

    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] chk = new boolean[MAX + 1];

        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i*i <= MAX; i++) {
            if (chk[i]) continue;
            prime.add(i);
            for (int j = i*i; j <= MAX; j+=i) {
                chk[j] = true;
            }
        }

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            boolean flag = false;
            for (Integer a : prime) {
                int b = n - a;
                if (!chk[b]) {
                    bw.write(n + " = " + a + " + " + b);
                    bw.newLine();
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                bw.write("Goldbach's conjecture is wrong.");
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
