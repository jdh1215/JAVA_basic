package day27;
import java.util.ArrayList;
import java.util.List;

public class DayJavacollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("바나나");
        list.add("포도");
        list.add("바나나");

        System.out.println("리스츠 전체 출력");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "변 ->" + list.contains("바나나"));
        }

        list.set(2, "오렌지");
        System.out.println("\n2번 인덱스를 오렌지로 변경함");

        System.out.println("'바나나'가 포함되어 있는가? " + list.contains("바나나"));

        list.remove(1);
        list.remove("바나나");

        System.out.println("\n삭제 후 리스트 크기: " + list.size());
        System.out.println("삭제 후 리스트 출력");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        list.clear();
        System.out.println("\nclear() 후 리스트 크기: " + list.size());
    }
}
