package day12;

import java.util.Scanner;

public class Day12Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day12ShapeCalculator s = new Day12ShapeCalculator();

        System.out.println("정사각형의 한 변의 길이를 입력하세요");
        int a = sc.nextInt();
        int result = s.calculate(a);
        System.out.println("정사각형 면적: " + result);

        System.out.println("직사각형의 가로와 세로의 길이를 입력하세요");
        int b = sc.nextInt();
        int c = sc.nextInt();
        result = s.calculate(b, c);
        System.out.println("직사각형 면적: " + result);

        System.out.println("원의 반지름의 길이를 입력하세요");
        double d = sc.nextDouble();
        s.calculate(d);
        System.out.println("원의 면적: " + s.calculate(d));


    }
}
