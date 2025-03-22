package day10;

import java.util.Scanner;

public class Day10Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day10Student[] arr = new Day10Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("학생 " + (i + 1) +"의 이름을 입력하세요: ");
            String name = sc.next();
            System.out.println("학생 " + (i + 1) + "의 나이를 입력하세요");
            int age = sc.nextInt();

            Day10Student student = new Day10Student(name, age);
            arr[i] = student;
        }
        for (int i = 0; i < 3; i++) {
            arr[i].introduce();
        }


        }
    }

