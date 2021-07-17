package basic;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs말단최단경로 {

    static class Node {

        int data;
        Node rt,lt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(bfs(root));

    }

    private static int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null) {
                    return level;
                } else {
                    if ( cur.lt != null) queue.offer(cur.lt);
                    if ( cur.rt != null) queue.offer(cur.rt);
                }
            }
            level++;
        }
        return -1;
    }

}
