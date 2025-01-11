package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int number1 = 2025;
//        System.out.print("출생 연도를 입력하세요:");
//        int i = sc.nextInt();
//        System.out.println("당신의 나이는 = " + (number1 - i));
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int i = sc.nextInt();


        System.out.print("두 번째 숫자를 입력하세요: ");
        int d = sc.nextInt();

        System.out.println(i + " + " + d + " = " + (i + d));
        System.out.println(i + " - " + d + " = " + (i - d));
        System.out.println(i + " * " + d + " = " + (i * d));
        System.out.println(i + " / " + d + " = " + (i / d));
        System.out.println(i + " % " + d + " = " + (i % d));



    }
}
