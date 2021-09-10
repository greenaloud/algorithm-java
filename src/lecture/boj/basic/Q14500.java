package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q14500 {

    static int n, m;
    static int[][] board;
    static int[][][] shape = {
            {{0,0}, {0,1}, {0,2}, {0,3}},   // 가로 일자
            {{0,0}, {1,0}, {2,0}, {3,0}},   // 세로 일자
            {{0,0}, {0,1}, {1,0}, {1,1}},   // 정사각형
            {{0,0}, {1,0}, {2,0}, {2,1}},   // 위로 긴 니은
            {{0,0}, {0,1}, {0,2}, {1,0}},   // 위 도형의 시계방향 90
            {{0,0}, {0,1}, {1,1}, {2,1}},   // 위 도형의 시계방향 90
            {{0,2}, {1,0}, {1,1}, {1,2}},   // 위 도형의 시계방향 90
            {{0,1}, {1,1}, {2,0}, {2,1}},   // 위로 긴 니은의 대칭
            {{0,0}, {1,0}, {1,1}, {1,2}},   // 위 도형의 시계방향 90
            {{0,0}, {0,1}, {1,0}, {2,0}},   // 위 도형의 시계방향 90
            {{0,0}, {0,1}, {0,2}, {1,2}},   // 위 도형의 시계방향 90
            {{0,1}, {1,0}, {1,1}, {2,0}},   // 오른쪽 위를 향하는 번개
            {{0,0}, {0,1}, {1,1}, {1,2}},   // 위 도형의 시계방향 90
            {{0,0}, {1,0}, {1,1}, {2,1}},   // 왼쪽 위를 향하는 번개
            {{0,1}, {0,2}, {1,0}, {1,1}},   // 위 도형의 시계방향 90
            {{0,1}, {1,0}, {1,1}, {1,2}},   // ㅗ
            {{0,0}, {1,0}, {1,1}, {2,0}},   // ㅏ
            {{0,0}, {0,1}, {0,2}, {1,1}},   // ㅜ
            {{0,1}, {1,0}, {1,1}, {2,1}}    // ㅓ
    };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   // 행
        m = Integer.parseInt(st.nextToken());   // 열

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = checkSum(i, j);
                answer = Math.max(sum, answer);
            }
        }

        System.out.println(answer);
    }

    private static int checkSum(int r, int c) {
        int max = 0;
        for (int i = 0; i < 19; i++) {
            int sum = 0;
            boolean flag = true;   // true -> 가능한 도형, false -> 불가능한 도형
            for (int j = 0; j < 4; j++) {
                int nr = r + shape[i][j][0];
                int nc = c + shape[i][j][1];
                if (nr < n && nc < m) {
                    sum += board[nr][nc];
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) max = Math.max(max, sum);
        }
        return max;
    }

}
