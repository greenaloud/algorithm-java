package basic;

public class DfsBasic {

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
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        dfs(root);

    }

    private static void dfs(Node root) {
        if (root == null) {
            return;
        } else {
            logic(root);
            dfs(root.lt);
            dfs(root.rt);
        }
    }

    private static void logic(Node root) {
        System.out.print(root.data + " ");
    }

}
