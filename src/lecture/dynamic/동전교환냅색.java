package lecture.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환냅색 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin);

        int target = sc.nextInt();

        int answer = 0;
        int idx = n-1;
        while (target > 0) {
            int divider = coin[idx];
            if (target / divider > 0) {
                answer += target / divider;
                target %= divider;
            }
            idx--;
        }
        System.out.println(answer);

    }

}
