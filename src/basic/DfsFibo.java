package basic;

public class DfsFibo {

    static int[] fibo;

    public static void main(String[] args) {

        int n = 6;
        fibo = new int[n+1];
        dfs(n);
        for (int i : fibo) {
            System.out.println("i = " + i);
        }
    }

    private static int dfs(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = dfs(n-2) + dfs(n-1);
        }
    }
}
