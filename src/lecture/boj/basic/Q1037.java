package lecture.boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int answer = n % 2 == 0 ? arr[0] * arr[n-1] : arr[n/2]*arr[n/2];
        System.out.println(answer);
    }

}
