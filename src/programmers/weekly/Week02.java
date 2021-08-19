package programmers.weekly;

import java.util.Arrays;

public class Week02 {

    public String solution(int[][] scores) {
        String answer = "";
        int len = scores.length;
        int[] score = new int[len];

        for (int i = 0; i < len; i++) {
            int self = 0;
            for (int j = 0; j < len; j++) {
                score[j] = scores[j][i];
                if (j == i) self = score[j];
            }
            Arrays.sort(score);

            float avg;
            if (score[0] == self && score[1] != self || score[len - 1] == self && score[len - 2] != self) {
                avg = ((float) Arrays.stream(score).sum() - self) / (len - 1);
            } else {
                avg = ((float) Arrays.stream(score).sum()) / len;
            }
            answer += getGrade(avg);
        }
        return answer;
    }

    private String getGrade(float avg) {
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

}
