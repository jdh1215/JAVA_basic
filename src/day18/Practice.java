package day18;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[31];
        for (int t = 0; t < 28; t++) {
            int i = sc.nextInt();
            arr [i] = 1;


        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] ==  0 ) {

                System.out.println(i);
            }



        }

        }

    }

