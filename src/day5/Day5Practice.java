package day5;

import java.util.Scanner;

public class Day5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번문제
//        for(int i = 1; i <= 10; i++) {
//            System.out.println("i = " + i);
//        }
//        int count = 1;
//        while (count <= 10) {
//            System.out.println("count = " + count);
//            count++;
//        }

        //2번문제
//        for(int i = 1; i <= 10; i+=2) {
//            System.out.println("i = " + i);
//        }
        //3번문제
//        for(int i = 1; i<= 10; i++) {
//            if(i % 2 == 0){
//                System.out.println("i = " + i);
//            }
//        }
        //4번문제
//        System.out.print("출력할 단을 입력하세요 (2~9): ");
//        int dan = sc.nextInt();
//        if(dan >= 2 && dan <=9){
//            for(int i = 9; i > 0; i--) {
//                System.out.println(dan + " x " + i + " = " + (dan * i));
//            }
//        }else{
//            System.out.println("올바른 수를 입력하세요");
//        }
        //5번문제

        System.out.print("출력할 단을 입력하세요 (2~9): ");
        int dan = sc.nextInt();
        if(dan >= 2 && dan <= 9) {
            for(int i = 3; i <= 18; i++){
                if(i == 3 || i == 6 || i == 7 || i == 18) {
                    System.out.println(dan + " x " + i + " = " + (dan * i));
                }
            }
        }
    }
}
