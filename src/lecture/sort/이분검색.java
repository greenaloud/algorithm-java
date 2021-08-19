package lecture.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int lt = 0, rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == target) {
                System.out.println(mid+1);
                return;
            } else if (arr[mid] > target) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
    }
}
