package day6;

import java.util.Scanner;

public class Day6deepRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("무한 반복문 시작");
//
//        while (true) {
//            System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다: ");
//            int input = sc.nextInt();
//            if (input == 0) {
//                break;
//            }
//            System.out.println("input = " + input);
//
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                System.out.println("5 건너뛰기");
//                continue;
//
//            }
//            System.out.println("i = " + i);
//        }
        System.out.println("구구단 표:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");

            }
            System.out.println();
        }
    }
}
