package boj;

import java.io.*;
import java.util.*;

public class Q5014 {

    static int[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());   //건물의 총 층 수
        int s = Integer.parseInt(st.nextToken());   //출발하는 층
        int g = Integer.parseInt(st.nextToken());   //목표 층
        int u = Integer.parseInt(st.nextToken());   //올라가기 버튼으로 올라가는 층 수
        int d = Integer.parseInt(st.nextToken());   //내려가기 버튼으로 내려가는 층 수

        visit = new int[f + 1];
        int answer = bfs(f, s, g, u, d);

        System.out.println(answer == -1 ? "use the stairs" : answer);
    }

    private static int bfs(int floors, int start, int goal, int up, int down) {
        if (start == goal) return 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = 1;
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < 2; j++) {
                    int nx;
                    if (j == 0) {
                        nx = x + up;
                    } else {
                        nx = x - down;
                    }
                    if (nx >= 1 && nx <= floors && visit[nx] == 0) {
                        if (nx == goal) {
                            return level + 1;
                        }
                        visit[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
