package boj;

import java.io.*;

public class Q1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(br.readLine());
        int n = target;
        int count = 0;

        do {
            if (n < 10) n *= 11;
            else {
                int temp = n/10 + n%10;
                n = (n%10)*10 + temp%10;
            }
            count++;
        } while (target != n);
        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }

}
