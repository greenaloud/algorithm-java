package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {

    static int[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        visit = new int[100001];

        if (start == end) {
            System.out.println(0);
            return;
        }
        System.out.println(bfs(start, end));

    }

    private static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = 1;
        int seconds = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx;
                    if (j == 0) {
                        nx = x - 1;
                    } else if (j == 1) {
                        nx = x + 1;
                    } else {
                        nx = x * 2;
                    }
                    if (nx >= 0 && nx <= 100000 && visit[nx] == 0) {
                        if (nx == end) {
                            return seconds + 1;
                        }
                        visit[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            seconds++;
        }
        return -1;
    }
}
