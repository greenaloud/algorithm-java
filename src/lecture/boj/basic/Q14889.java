package lecture.boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q14889 {

    static int N;
    static int answer = Integer.MAX_VALUE;
    // 각 팀에 해당하는 선수의 인덱스 번호를 저장하는 배열
    static int[] left, right;
    static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        left = new int[N/2];
        right = new int[N/2];
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        logic(0, 0, 0);
        System.out.println(answer);
    }

    private static void logic(int idx, int l, int r) {
        if (idx == N) {
            // 양팀의 능력치의 차이를 구하고
            int diff = getDiff();
            // 차이가 최솟값일 때 갱신
            answer = Math.min(diff, answer);
            return;
        }
        if (l < N/2) {
            left[l] = idx;
            logic(idx + 1, l + 1, r);
        }
        if (r < N/2) {
            right[r] = idx;
            logic(idx + 1, l, r + 1);
        }
    }

    private static int getDiff() {
        int tl = 0, tr = 0;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N / 2; j++) {
                if (i == j) continue;
                tl += board[left[i]][left[j]];
                tr += board[right[i]][right[j]];
            }
        }
        return Math.abs(tl - tr);
    }

}
