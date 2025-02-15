package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Day7Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char[] chars = new char[4];
//        chars[0] = 't';
//        chars[1] = 'h';
//        chars[2] = 'a';
//        chars[3] = 'r';
//        int[] ints = {85, 90, 78, 92, 88};
//        System.out.println(chars[0]);
//        for (int i = 0; i < ints.length; i++ ){
//            System.out.println(ints[i]);
//        }
//        System.out.println(chars.length);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for(int i = 0; i < l; i++) {
            System.out.print("수를 입력하세요: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }
}
