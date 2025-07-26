package day24;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Bonas {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double max = -100;
//        int i = sc.nextInt();
//        double[] arr = new double[i];
//        for (int t = 0; t < i; t++) {
//            arr[t] = sc.nextDouble();
//        }
//        for (int f = 0; f < i; f++) {
//            if (arr[f] > max) {
//                max = arr[f];
//            }
//        }
//        for (int d = 0; d < i; d++) {
//            arr[d] = arr[d] / max * 100;
//        }
//
//        double total = 0;
//        for (int r= 0; r < i; r++) {
//            total += arr[r];
//        }
//
//        double avg = total / i;
//
//
//        System.out.print(avg);

        Scanner in = new Scanner(System.in);

        double arr[] = new double[in.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.print(sum / arr.length);
    }
}
