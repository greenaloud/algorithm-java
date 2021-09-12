package lecture.boj.basic;

import java.io.*;

public class Q9095a {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int target = Integer.parseInt(br.readLine());
            int result = logic(0, target);
            bw.write(result + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static int logic(int sum, int target) {
        int answer = 0;

        if (sum > target) return 0;
        if (sum == target) return 1;
        for (int i = 1; i <= 3; i++) {
            answer += logic(sum + i, target);
        }

        return answer;
    }

}
