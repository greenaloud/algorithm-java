package lecture.boj.basic;

import java.io.*;

public class Q1748 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        int digits = s.length(); // 입력받은 수의 자릿수를 저장

        int answer = 0;
        // digits-1 자릿수 까지의 1부터 모든수를 붙여만든 수의 자릿수 구하기! (주어진 수가 4자리라면 999 까지, 5자리라면 9999 까지)
        for (int i = 1; i < digits; i++) {
            answer += i * 9 * Math.pow(10, i - 1);
        }
        answer += (n - (Math.pow(10, digits - 1) - 1)) * digits;
        System.out.println(answer);
    }

}
