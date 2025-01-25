package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int i =  sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.println("세 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();

        double result = (double) (i + a + b) / 3;
        System.out.println(" average = " + result);
        double average4 = Math.round(result);
        System.out.println("average4 = " + average4);
    }
}