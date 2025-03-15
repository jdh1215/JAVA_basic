package day11;

import java.util.Scanner;

public class Day11Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day11User user = new Day11User();

        System.out.println("아이디를 입력하세요");
        String n = sc.next();
        user.setId(n);

        System.out.println("비밀번허를 입력하세요");
        String p = sc.next();
        if (p.length() < 8) {
            return;
        }
        user.setPassword(p);

        System.out.println(user.getId());
        System.out.println(user.getPassword());
    }


    }

