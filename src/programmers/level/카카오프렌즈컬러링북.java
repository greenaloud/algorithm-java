package programmers.level;

public class 카카오프렌즈컬러링북 {

    static int count = 0;
    static int h, w;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        h = m;
        w = n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0) {
                    int k = picture[i][j];
                    dfs(i, j, k, picture);
                    maxSizeOfOneArea = Math.max(count, maxSizeOfOneArea);
                    numberOfArea++;
                    count = 0;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private void dfs(int i, int j, int k, int[][] picture) {
        picture[i][j] = 0;
        count++;
        for (int l = 0; l < 4; l++) {
            int nx = i + dx[l];
            int ny = j + dy[l];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && picture[nx][ny] == k) {
                dfs(nx, ny, k, picture);
            }
        }
    }

}
