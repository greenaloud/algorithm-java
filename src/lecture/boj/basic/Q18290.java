package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q18290 {

    static int N, M, K;
    static int answer = Integer.MIN_VALUE;
    // 동 서 남 북
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] board;
    static boolean[][] chk;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 행의 갯수
        M = Integer.parseInt(st.nextToken());   // 열의 갯수
        K = Integer.parseInt(st.nextToken());   // 선택할 칸의 수

        board = new int[N][M];
        chk = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check(0, 0, 0, 0);
        System.out.println(answer);
    }

    private static void check(int cx, int cy, int cnt, int sum) {
        if (cnt == K) {
            answer = Math.max(sum, answer);
            return;
        }
        for (int x = cx; x < N; x++) {
            for (int y = (x == cx ? cy : 0); y < M; y++) {
                if (chk[x][y]) continue;
                boolean ok = true;
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                        if (chk[nx][ny]) ok = false;
                    }
                }
                if (ok) {
                    chk[x][y] = true;
                    check(x, y, cnt + 1, sum + board[x][y]);
                    chk[x][y] = false;
                }
            }
        }
    }

}
