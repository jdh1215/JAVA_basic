package day27;
import java.util.HashMap;
import  java.util.Map;
public class Day27Map {
    public static void main(String[] args) {
        Map<String, Integer> gradeMap = new HashMap<>();

        gradeMap.put("철희", 85);
        gradeMap.put("영희", 92);
        gradeMap.put("민수", 78);

        int yeongScore = gradeMap.get("영희");
        System.out.println("영희와 철수 ->" + yeongScore);

        System.out.println("'민수'가 등록되었는가?" + gradeMap.containsKey("민수"));

        gradeMap.remove("철수");
        System.out.println("\n'철수' 삭제 후 크기" + gradeMap.size());

        System.out.println("\n전체 학생과 점수 출력");
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
