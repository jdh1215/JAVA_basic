package day6;

import java.util.Scanner;

public class day6Practice {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        //1번 문재
//
//        for (int i = 1; i <= 10; i++) {
//            if ((i % 2) != 0) {
//
//                continue;
//            }
//            System.out.println("i = " + i);;
//        }
        //2번문재
//        System.out.println("숫자를 입력하세요: ");
//        int number = sc.nextInt();
//        int result = 0;
//        for (int i = 1; i <= number; i++) {
//            result += i;
//            if (result > 50) {
//                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
//                break;
//            }
//            System.out.println("현재합계: " + result);
//
//
//        }
//        System.out.println("최종합계: " + result);

        //hello
//        System.out.println("삼각형의 높이를 입력하세요: ");
//        int h = sc.nextInt();
//        for (int i = 1; i <= h; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print('*');
//
//            }
//            System.out.println();
//        }
        //4번문제
        System.out.println("삼각형의 높이를 입력하세요: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = l * 2 - (i * 2 + 1) ; j > 0; j--) {
                System.out.print("*");
            }
            if (i < l - 1) {
                System.out.println();
            }

        }
    }
}
