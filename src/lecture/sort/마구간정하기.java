package lecture.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int answer = 0;
        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) < c) {
                rt = mid -1;
            } else {
                lt = mid + 1;
                answer = mid;
            }
        }
        System.out.println(answer);
    }

    private static int count(int[] arr, int mid) {
        int count = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ep + mid > arr[i]) {
                continue;
            } else {
                ep = arr[i];
            }
            count++;
        }
        return count;
    }

}
