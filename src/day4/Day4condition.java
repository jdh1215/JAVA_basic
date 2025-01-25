package day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day4condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int number = sc.nextInt();
//        if (number > 0) {
//            System.out.println("양수입니다.");
//        } else if ( number < 0) {
//            System.out.println("음수입니다.");
//        } else {
//            System.out.println("0입니다.");
//        }
//
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("월요일");
//                break;
//            case 2:
//                System.out.println("화요일");
//                break;
//            case 3:
//                System.out.println("수요일");
//                break;
//            default:
//                System.out.println("잘못된 값입니다.");
    //}
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 숫자는 " + num1 + "입니다.");
        }
        else {
            System.out.println("더 큰 숫자는 " + num2 + "입니다.");
        }
//        int maxNum = (num1 > num2) ? num1 : num2;
//        System.out.println("더 큰 숫자는 " + maxNum + "입니다.");


    }
}
