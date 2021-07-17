package basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs_미로최단거리 {

    // 우-하-좌-상의 시계방향 순으로 이동
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;

    static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new int[8][8];  // 7*7 격자
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(bfs(1, 1));

    }

    private static int bfs(int x, int y) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.offer(new Coordinate(x, y));
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Coordinate cur = queue.poll();
                int curX = cur.x;
                int curY = cur.y;
                if (curX == 7 && curY == 7) {
                    return level;
                }
                board[curX][curY] = 1;
                for (int j = 0; j < 4; j++) {
                    int nx = curX + dx[j];
                    int ny = curY + dy[j];
                    if (nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && board[nx][ny] == 0) {
                        queue.offer(new Coordinate(nx, ny));
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
