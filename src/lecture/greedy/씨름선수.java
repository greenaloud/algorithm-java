package lecture.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름선수 {

    static class Athlete implements Comparable<Athlete> {
        int height, weight;

        public Athlete(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Athlete o) {
            if (this.height == o.height) {
                return o.weight - this.weight;
            } else {
                return o.height - this.height;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Athlete[] arr = new Athlete[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Athlete(height, weight);
        }
        Arrays.sort(arr);

        int count = 0;
        int max = Integer.MIN_VALUE;
        for (Athlete a : arr) {
            if (a.weight >= max) {
                count++;
                max = a.weight;
            }
        }
        System.out.println(count);
    }
}
