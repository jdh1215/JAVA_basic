package day9;

public class Day9Practice {
    public static void main(String[] args) {

        Day9Yeoaptteok Yeoaptteok1 = new Day9Yeoaptteok();
        Yeoaptteok1.name = "노도엽기떡볶이";
        Yeoaptteok1.age = 51;
        Yeoaptteok1.personality = "너무 나빠요ㅠㅠㅠㅠㅠ";
        Yeoaptteok1.height = 173;
        Yeoaptteok1.gender = "woman";


        System.out.println("엽똑 이름 = " + Yeoaptteok1.name);
        System.out.println("엽떡 나이 = " + Yeoaptteok1.age);
        System.out.println("엽떡 인성 = " + Yeoaptteok1.personality);
        System.out.println("엽떡 키 = " + Yeoaptteok1.height);
        System.out.println("엽떡이 성별 = " + Yeoaptteok1.gender);

        Yeoaptteok1.eat();
        Yeoaptteok1.laugh();


    }
}
