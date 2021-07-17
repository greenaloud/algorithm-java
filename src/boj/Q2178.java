package boj;

import java.util.*;

public class Q2178 {

    // 우, 하, 좌, 상
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int m;

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] graph = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            char[] inputs = sc.next().toCharArray();
            for (int j = 1; j <= inputs.length; j++) {
                graph[i][j] = Character.getNumericValue(inputs[j-1]);
            }
        }

        graph[1][1] = 0;
        bfs(graph, new Point(1, 1));

    }

    private static void bfs(int[][] graph, Point point) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(point);
        while (!queue.isEmpty()) {
            Point now = queue.poll();
            int x = now.getX();
            int y = now.getY();
            int level = graph[x][y];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && graph[nx][ny] == 1) {
                    if (nx == n && ny == m) {
                        System.out.println(level + 2);
                        return;
                    }
                    queue.offer(new Point(nx, ny));
                    graph[nx][ny] = level+1;
                }
            }
        }
    }

}
