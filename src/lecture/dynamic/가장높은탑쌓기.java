package lecture.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class 가장높은탑쌓기 {

    static class Brick implements Comparable<Brick> {
        int s, h, w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Brick[] arr = new Brick[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = new Brick(a, b, c);
        }

        Arrays.sort(arr);

        // 해당 인덱스의 벽돌을 포함해서 쌓을 수 있는 최대 높이
        int[] dy = new int[n];
        dy[0] = arr[0].h;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j].w > arr[i].w && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr[i].h;
        }
        int answer = Arrays.stream(dy).max().getAsInt();
        System.out.println(answer);
    }

}
