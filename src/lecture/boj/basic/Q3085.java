package lecture.boj.basic;

import java.io.*;

public class Q3085 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] table = new char[n][n];

        for (int i = 0; i < n; i++) {
            table[i] = br.readLine().toCharArray();
        }

        // 동 남
        int[] dx = {1, 0};
        int[] dy = {0, 1};

        int max = 0;
        // 행
        for (int i = 0; i < n; i++) {
            // 열
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < n && ny < n && table[nx][ny] != table[i][j]) {
                        swap(table, i, j, nx, ny);
                        int count = check(table);
                        if (count > max) max = count;
                        swap(table, i, j, nx, ny);
                    }
                }
            }
        }
        System.out.println(max);
    }

    private static void swap(char[][] table, int cx, int cy, int nx, int ny) {
        char temp = table[cx][cy];
        table[cx][cy] = table[nx][ny];
        table[nx][ny] = temp;
    }

    private static int check(char[][] table) {
        int max = 0;
        int n = table.length;

        // 행 방향 최대 연속
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (table[i][j-1] == table[i][j]) count++;
                else count = 1;
                if (count > max) max = count;
            }

            count = 1;
            for (int j = 1; j < n; j++) {
                if (table[j - 1][i] == table[j][i]) count++;
                else count = 1;
                if (count > max) max = count;
            }
        }

        return max;
    }

}
