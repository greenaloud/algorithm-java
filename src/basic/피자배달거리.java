package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class 피자배달거리 {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] comb;
    static ArrayList<Point> house, pizza;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    house.add(new Point(i, j));
                } else if (temp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        len = pizza.size();
        comb = new int[m];
        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int level, int start) {
        if (level == m) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int c : comb) {
                    Point p = pizza.get(c);
                    dis = Math.min(dis, Math.abs(h.x - p.x) + Math.abs(h.y - p.y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < len; i++) {
                comb[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
}
