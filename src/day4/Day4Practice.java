package day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1번 문제
//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 숫자를 입력하세요: ");
//        int num3 = sc.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("세 수 중 가장 큰 값은: " + num1);
//        }else if (num1 < num2 && num2 > num3) {
//            System.out.println("세 수 중 가장 크 값은: " + num2);
//
//        }else {
//            System.out.println("세 수 중 가장 큰 값은: " + num3);
//        }

        // 2번 문제

//        System.out.print("월을 입력하세요 (1~12): ");
//        int month = sc.nextInt();
//        int weather = (month % 12) / 3;
//        switch(weather) {
//            case 0:
//                System.out.println("겨울");
//                break;
//            case 1:
//                System.out.println("봄");
//                break;
//            case 2:
//                System.out.println("여름");
//                break;
//            case 3:
//                System.out.println("가을");
//                break;
//
//
//        }
       System.out.print("첫 번째 숫자를 입력하세요: ");
       double num1 = sc.nextDouble();
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char calculate = sc.next().charAt(0);
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = sc.nextDouble();
        switch(calculate) {
            case '+':
                System.out.println("결과: " + (num1 + num2));
                break;
            case '-':
                System.out.println("결과: " + (num1 - num2));
                break;
            case '*':
                System.out.println("결과: " + (num1 * num2));
                break;
            case '/':
                System.out.println("결과: " + (num1 / num2));
                break;
        }



    }
}
