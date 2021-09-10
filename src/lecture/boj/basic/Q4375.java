package lecture.boj.basic;

import java.io.*;

public class Q4375 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            int target = Integer.parseInt(s);
            int rem = 1 % target;
            int i;
            for (i = 1; i < target; i++) {
                if (rem == 0) break;
                rem = (rem * 10 + 1) % target;
            }
            bw.write(i + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
