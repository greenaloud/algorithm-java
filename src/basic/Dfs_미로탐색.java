package basic;

import java.util.Scanner;

public class Dfs_미로탐색 {

    static int answer = 0;
    static int[] dx, dy;
    static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        dx = new int[] {0, 1, 0, -1};
        dy = new int[] {1, 0, -1, 0};

        board[1][1] = 1;
        dfs(1, 1);
        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx > 0 && ny > 0 && nx <= 7 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dfs(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
