package lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 결혼식2 {

    static class Time implements Comparable<Time> {
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.state - o.state;
            } else {
                return this.time - o.time;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            times.add(new Time(s, 's'));
            times.add(new Time(e, 'e'));
        }
        Collections.sort(times);

        int now = 0;
        int answer = 0;
        for (Time t : times) {
            if (t.state == 's') {
                if (++now > answer) answer = now;
            } else {
                now--;
            }
        }
        System.out.println(answer);
    }
}
