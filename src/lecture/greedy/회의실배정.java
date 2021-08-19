package lecture.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실배정 {

    static class Meeting implements Comparable<Meeting> {

        int s, e;

        public Meeting(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.e == o.e) {
                return this.s - o.s;
            } else {
                return this.e - o.e;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] arr = new Meeting[n];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[i] = new Meeting(s, e);
        }
        Arrays.sort(arr);

        int ep = 0;
        int answer = 0;
        for (Meeting m : arr) {
            if (m.s >= ep) {
                ep = m.e;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
