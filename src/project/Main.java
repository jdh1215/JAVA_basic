package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintUtil printUtil = new PrintUtil();



        Hospital jomusa = new Hospital("조무사 병원" ,"부천" );
        Hospital coma = new Hospital("coma 병원" ,"수원" );
        Hospital catholic = new Hospital("가톨릭 병원" ,"서울" );


        System.out.print("1.예약하기\n2.조회하기\n3.끝내기\n>>> ");
        int i = sc.nextInt();

        if (i == 1) {
            System.out.print("이름 :");
            String n = sc.next();
            System.out.print("생년월일 :");
            String b = sc.next();
            System.out.print("혈액형 :");
            String bt = sc.next();

            System.out.print("1.조무사 병원\n2.가톨릭 병원\n3.coma 병원\n>>> ");
            int h = sc.nextInt();

            System.out.print("" +
                    "[진료과목]\n" +
                    "정형외과 | 골절, 골다공증, 관절질환\n" +
                    "내과     | Pneumonoultramicroscopicsilicovolcanoconiosis, 고도비만, 당뇨\n" +
                    "피부과   | 아토피, 백반증, 습진\n" +
                    ">>> 병명을 입력하세요 : ");
            String d = sc.next();

            String department = "";
            switch (d) {
                case "골절", "골다공증", "관절질환":
                    //정형외과
                    department = "정형외과";
                    break;
                case "규성 진폐증", "고도비만", "당뇨":
                    department = "내과  ";
                    break;
                case "아토피", "백반증", "습진":
                    department = "피부과 ";
                    break;
            }
            System.out.print("1. 선불\n2. 후불\n>>>");
            String p = sc.next();
            Reservation r = new Reservation(n, b, bt, department, d, p);
            switch (h) {
                case 1:
                    jomusa.getReservations().add(r);
                    break;
                case 2:
                    catholic.getReservations().add(r);
                    break;
                case 3:
                    coma.getReservations().add(r);
                    break;
            }
            printUtil.jomusa(n, b, bt, department, d, p, p );
            printUtil.coma(n, b, bt, department, d, p, p );
            printUtil.catholic(n, b, bt, department, d, p, p );
        } else if (i == 2) {

        }

    }
}
