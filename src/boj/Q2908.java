package boj;

import java.io.*;

public class Q2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] numA = {str.charAt(2), str.charAt(1), str.charAt(0)};
        char[] numB = {str.charAt(6), str.charAt(5), str.charAt(4)};

        for (int i = 0; i < 3; i++) {
            if (numA[i] > numB[i]) {
                System.out.println(numA);
                return;
            } else if (numA[i] < numB[i]) {
                System.out.println(numB);
                return;
            }
        }
    }

}
