package lecture.sort;

import java.util.Scanner;

public class LRU {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cache = new int[n];
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        // arr
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < n; i++) {
                if (x == cache[i]) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                //Cache Miss
                for (int i = n-1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                //Cache Hit
                for (int i = pos; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}
