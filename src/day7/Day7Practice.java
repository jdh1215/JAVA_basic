package day7;

import java.util.Scanner;

public class Day7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("학생 수를 입력하세요: ");
//        int i = sc.nextInt();
//        int[] e = new int[i];
//        int sum = 0;
//        for (int l = 0; l<i; l++ ) {
//            System.out.print("학생들의 점수를 입력해주세요. 학생 " + (l + 1) + ": ");
//            e[l] = sc.nextInt();
//            sum = e[l] + sum;
//
//        }
//        double average = sum / i;
//
//        System.out.println("학생들의 평균 점수는: " + average);
        System.out.print("배열의 크기를 입력하세요: " );
        int l = sc.nextInt();
        int [] e = new int[l];


        for(int i = 0; i < l; i++) {
            System.out.print("숫자를 하나 입력해주세요: ");
            e[i] = sc.nextInt();
        }
        int max = e[0];
        int min = e[0];
        for (int i = 0; i < l; i++) {
//            e[i]
            if (e[i] > max) {
                max = e[i];
            }
            if (e[i] < min) {
                min = e[i];
            }
        }
        System.out.println("최댓값은: " + max);
        System.out.println("최솟값은: " + min);
    }
}
