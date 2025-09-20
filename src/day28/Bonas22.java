package day28;

import java.util.Map;
import java.util.Scanner;

public class Bonas22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> score = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );

        for (int i = 0; i <20; i++) {
            String subject = sc.next();
            double time = sc.nextDouble();
            String sGrade = sc.next();
            double grade = score.get(sGrade);
        }
    }
}
