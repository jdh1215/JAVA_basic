package day27;
import java.util.HashMap;
import  java.util.Map;
public class Day27Map {
    public static void main(String[] args) {
        Map<String, Integer> gradeMap = new HashMap<>();

        gradeMap.put("철수", 85);
        gradeMap.put("영희", 92);
        gradeMap.put("진우", 10);

        int yeongScore = gradeMap.get("영희");
        System.out.println("영희와 철수 ->" + yeongScore);

        System.out.println("'민수'가 등록되었는가?" + gradeMap.containsKey("민수"));

        gradeMap.remove("철수");
        System.out.println("\n'철수' 삭제 후 크기" + gradeMap.size());

        System.out.println("\n전체 학생과 점수 출력");
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("\nkeySet()으로 다시 출력");
        for (String name : gradeMap.keySet()) {
            System.out.println(name + "->" + gradeMap.get(name));
        }

        gradeMap.clear();
        System.out.println("\nclear() 후 Map 크기 ->" + gradeMap.size());

    }
}
