package basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs송아지찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));

    }

    private static int bfs(int s, int e) {
        int[] dist = {1, 5, -1}; // 움직일 수 있는 이동거리 3가지
        int[] ch = new int[10001]; // 이미 방문한 좌표의 인덱스의 값을 1로 설정해서 방문처리

        Queue<Integer> queue = new LinkedList<>();
        ch[s] = 1;
        queue.offer(s);
        int move = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i <len; i++) {
                int x = queue.poll();
                if (x == e) {
                    return move;
                } else {
                    for (int d : dist) {
                        int nx = x + d;
                        if (nx > 0 && nx <= 10000 && ch[nx] == 0) {
                            ch[nx] = 1;
                            queue.offer(nx);
                        }
                    }
                }
            }
            move++;
        }
        return -1;
    }
}
