package project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintUtil printUtil = new PrintUtil();



        Hospital[] hospitals = {
                new Hospital("조무사 병원" ,"부천" ),
                new Hospital("coma 병원" ,"수원" ),
                new Hospital("가톨릭 병원" ,"서울" )
        };


        int i = 0;
        while (i != 3) {


            System.out.print("1.예약하기\n2.조회하기\n3.끝내기\n>>> ");
            i = sc.nextInt();

            if (i == 1) {
                System.out.print("이름 :");
                String n = sc.next();
                System.out.print("생년월일 :");
                String b = sc.next();
                System.out.print("혈액형 :");
                String bt = sc.next();

                int h;

                while (true) {
                    System.out.print("1.조무사 병원\n2.가톨릭 병원\n3.coma 병원\n>>> ");
                    h = sc.nextInt();
                    if (h == 1 || h == 2 || h == 3) break;
                }
                String[] dArray = {"골절", "골다공증", "관절질환", "규성진폐증", "고도비만", "당뇨", "아토피", "백반증", "습진", "진우"};
                List<String> dList = Arrays.asList(dArray);

                String d;
                while (true) {
                    System.out.print("" +
                            "[진료과목]\n" +
                            "정형외과 | 골절, 골다공증, 관절질환\n" +
                            "내과     | 규성진폐증, 고도비만, 당뇨\n" +
                            "피부과   | 아토피, 백반증, 습진\n" +
                            ">>> 병명을 입력하세요 : ");
                    d = sc.next();
                    if (dList.contains(d)) {
                        break;
                    } else {
                        System.out.println("잘못된 병명입니다. 다시 입력하세요.");
                    }
                }

                String department = "";
                int price = 0;
                switch (d) {
                    case "골절", "골다공증", "관절질환":
                        //정형외과
                        department = "정형외과";
                        price += 15000;
                        break;
                    case "규성 진폐증", "고도비만", "당뇨", "진우":
                        department = "내과  ";
                        price += 12000;
                        break;
                    case "아토피", "백반증", "습진":
                        department = "피부과 ";
                        price += 4500;
                        break;
                }
                System.out.print("1. 선불\n2. 후불\n>>>");
                String p = sc.next();

                int age = 2025 - Integer.parseInt(b.substring(0, 4)) + 1;
                if (age >= 20 && age < 70) {
                    price += 5000;
                } else {
                    price += 2000;
                }
                if (h == 2) {
                    price += 1500;
                }

                String pay;
                if (p.equals("선불") || p.equals("1")) {
                    pay = "결제 완료";
                } else {
                    pay = "결제 미완";
                }

                Reservation r = new Reservation(n, b, bt, department, d, pay, price);
                switch (h) {
                    case 1:
                        hospitals[0].getReservations().add(r);
                        break;
                    case 2:
                        hospitals[2].getReservations().add(r);
                        break;
                    case 3:
                        hospitals[1].getReservations().add(r);
                        break;
                }




                if (h == 1) {
                    printUtil.jomusa(r);
                }
                if (h == 2) {
                    printUtil.catholic(r);
                }
                if (h == 3) {
                    printUtil.coma(r);
                }
            } else if (i == 2) {
                System.out.print("이름:");
                String name = sc.next();
                System.out.print("생년월일:");
                String birthday = sc.next();

                for (int j = 0; j < 3; j++) {
                    List<Reservation> reservations = hospitals[j].getReservations();
                    for (int k = 0; k < reservations.size(); k++) {
                        Reservation reservation = reservations.get(k);

                        if (reservation.getName().equals(name) && reservation.getBirthday().equals(birthday)) {
                            if (j == 0) {
                                printUtil.jomusa(reservation);
                            }
                            if (j == 1) {
                                printUtil.coma(reservation);
                            }
                            if (j == 2) {
                                printUtil.catholic(reservation);
                            }
                        }


                    }
                }
            }
        }

    }
}
