package basic;

public class Dfs부분집합 {

    static int n;
    static int[] ch;

    public static void main(String[] args) {

        n = 5;
        ch = new int[n + 1];
        dfs(1);

    }

    private static void dfs(int level) {
        if (level > n) {
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    temp += (i + " ");
                }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            ch[level] = 1;
            dfs(level + 1);
            ch[level] = 0;
            dfs(level + 1);
        }
    }

}
