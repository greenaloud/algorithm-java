package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7569 {

    static int m, n, h, un = 0;
    // 우, 앞, 좌, 뒤, 하, 상
    static int[] dx = {1, 0, -1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] box;
    static Queue<Point> queue = new LinkedList<>();

    static class Point {
        int x, y, z;
        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        box = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    int temp = Integer.parseInt(st.nextToken());
                    if (temp == 1) {
                        queue.offer(new Point(k, j, i));
                    } else if (temp == 0) {
                        un++;
                    }
                    box[i][j][k] = temp;
                }
            }
        }
        int answer = bfs();
        System.out.println(un == 0 ? answer : -1);
    }

    private static int bfs() {
        int days = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Point now = queue.poll();
                for (int j = 0; j < 6; j++) {
                    int nx = now.x + dx[j];
                    int ny = now.y + dy[j];
                    int nz = now.z + dz[j];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && nz >= 0 && nz < h && box[nz][ny][nx] == 0) {
                        queue.offer(new Point(nx, ny, nz));
                        un--;
                        box[nz][ny][nx] = days +1;
                    }
                }
            }
            days++;
        }
        return days-1;
    }
}
