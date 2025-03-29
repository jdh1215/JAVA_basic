package day12;

import java.util.Scanner;

public class Day12Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day12Payment c = new Day12Payment();

        System.out.println("두 수를 입력하세료");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = c.calculate(a , b);
        System.out.println("두 상품 총액: " + result + "원");

        System.out.println("세 수를 입력하세요");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        result = c.calculate(d, e, f);
        System.out.println("세 상품 총액: " + result + "원");

        System.out.println("두 실수를 입력하세요");
        double g = sc.nextDouble();
        double h = sc.nextDouble();
         c.calculate(g, h);
        System.out.println("두 상품 총액(실수)" + c.calculate(g, h) + "원");

        System.out.println("연필(1500원) 몇 개를 구매할까요?");
        int i = sc.nextInt();
        result = c.calculate(i);
        System.out.println("연필 총액: " + result + "원 입니다");


    }
}
