package day8;

import java.util.Arrays;

public class Day8Arrayadvanced {
    public static void main(String[] args) {

        int[] scores = {45, 67, 89, 72, 50};
        System.out.print("50점 이상인 점수: ");
        for (int score : scores) {
            if (score >= 50) {
                System.out.print(score + " ");
            }

        }
        Arrays.sort(scores);
        System.out.println("정렬된 점수:" + Arrays.toString(scores));
        for (int i = 0; i < scores.length / 2; i++) {
            int temp = scores[i];
            scores[i] = scores[scores.length - i - 1];
            scores [scores.length - i - 1] = temp;
        }
        System.out.println("내림차순 정렬 = " + Arrays.toString(scores));
        int[][] ss = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ss[i][j] = i + j;

            }
        }
        int[][] studentScore = {
                {85, 90, 92},
                {78, 88, 80},
                {90, 94, 99}
        };
    }
}
