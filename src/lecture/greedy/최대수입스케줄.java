package lecture.greedy;

import java.util.*;

public class 최대수입스케줄 {

    static class Lecture implements Comparable<Lecture> {
        int days;
        int pay;

        public Lecture(int days, int pay) {
            this.days = days;
            this.pay = pay;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.days - this.days;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Lecture> lectures = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pay = sc.nextInt();
            int days = sc.nextInt();
            lectures.add(new Lecture(days, pay));
        }
        Collections.sort(lectures);

        int answer = 0;
        int max = lectures.get(0).days;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for (int i = max; i > 0 ; i--) {
            for (; j < n; j++) {
                if (lectures.get(j).days < i) break;
                pQueue.offer(lectures.get(j).pay);
            }
            if (!pQueue.isEmpty()) answer += pQueue.poll();
        }
        System.out.println(answer);

    }

}
