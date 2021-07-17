package boj;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q2667 {

    static int n ,count;
    static List<Integer> answers = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < n; j++) {
                graph[i][j] = Character.getNumericValue(chars[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    graph[i][j] = 0;
                    dfs(i, j);
                    answers.add(count);
                    count = 0;
                }
            }
        }

        answers.sort(Comparator.naturalOrder());
        System.out.println(answers.size());
        for (int answer : answers) {
            System.out.println(answer);
        }

    }

    private static void dfs(int x, int y) {
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>=0 && nx<n && ny>=0 && ny<n && graph[nx][ny] == 1) {
                graph[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }
}