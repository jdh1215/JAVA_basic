package day9;

import java.util.Scanner;

public class Day9Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형의 높이를 입력하세요: ");
        int h = sc.nextInt();
        int t = 0;
        for (int i = 1; i <=h; i++) {
            for (int j = h -1; j >= i; j--) {
                System.out.print(" ");

            }

            for (int j = 1; j <=(i + t) ; j++) {

                System.out.print('*');

            }
            System.out.println();
            t++;
        }

        System.out.println("삼각형의 높이를 입력하세요: ");
        int n = sc.nextInt();
        int p = 8;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= (i + p) ; j++) {

                System.out.print('*');

            }
            if (i != n) {
                System.out.println();
            }

            t-=3;
        }
    }
}
