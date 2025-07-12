package day19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://www.acmicpc.net/problem/3052
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int t = sc.nextInt();
            numbers.add(t % 42);
        }

        System.out.print(numbers.size());*/

        int[] arr = {-1, -1, -1,-1, -1, -1,-1, -1, -1,-1};
        for (int i = 0; i < 10; i++) {
            int t = sc.nextInt();

            boolean flag = false;
            for (int j = 0; j < 10; j++) {
                if (arr[j] == (t % 42)) {
                    flag = true;
                }
            }

            if (!flag) {
                arr[i] = t % 42;
            }
        }

        int count = 0;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] != -1) {
                count++;
            }
        }

        System.out.println(count);

    }
}