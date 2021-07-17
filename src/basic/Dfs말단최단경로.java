package basic;

public class Dfs말단최단경로 {

    static class Node {
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }

    public static void main(String[] args) {

        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(dfs(root, 0));
    }

    private static int dfs(Node root, int level) {

        if (root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(dfs(root.lt, level + 1), dfs(root.rt, level + 1));
        }

    }

}
