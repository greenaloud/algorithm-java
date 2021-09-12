package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759 {

    static int L, C;
    static char[] pass, code;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());   // 암호의 길이
        C = Integer.parseInt(st.nextToken());   // 가능한 문자의 갯수

        // 가능성 있는 암호를 저장 할 배열
        code = new char[L];
        // 암호로 사용 가능한 문자를 저장할 배열 -> 변하지 않음
        String str = br.readLine();
        pass = new char[C];
        for (int i = 0; i < C; i++) {
            pass[i] = str.charAt(2 * i);
        }
        Arrays.sort(pass);

        logic(0, 0);

        bw.flush();
        br.close();
        bw.close();
    }

    private static void logic(int start, int cnt) throws IOException {
        if (cnt == L) {
            if (!check(code)) return;
            bw.write(code);
            bw.newLine();
            return;
        }
        for (int i = start; i < C; i++) {
            code[cnt] = pass[i];
            logic(i + 1, cnt + 1);
        }
    }

    private static boolean check(char[] code) {
        int ja = 0;
        int mo = 0;

        for (char c : code) {
            if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u') mo++;
            else ja++;
        }

        if (mo >= 1 && ja >= 2) return true;
        return false;
    }

}
