package lecture.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (check(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        System.out.println(answer);
    }

    private static int check(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > mid) {
                count++;
                sum = x;
            } else {
                sum +=x;
            }
        }
        return count;
    }
}
