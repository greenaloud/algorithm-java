    package boj;

    import java.io.*;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Q15656 {

        static int N, M;
        static int[] numbers;
        static BufferedWriter bw;
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(numbers);

            logic(0);
            bw.flush();
            br.close();
            bw.close();
        }

        private static void logic(int cnt) throws IOException {
            if (cnt == M) {
                bw.write(sb.toString());
                bw.newLine();
                return;
            }
            for (int i = 0; i < N; i++) {
                int len = sb.length();
                sb.append(numbers[i]).append(" ");
                logic(cnt + 1);
                sb.delete(len, sb.length() + 1);
            }
        }

    }
