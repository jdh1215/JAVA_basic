package day12;

public class Day12ObjectArray {
    public static void main(String[] args) {
        Day12Student[] day12Students = new Day12Student[3];
        day12Students[0] = new Day12Student("철수", 15);
        day12Students[1] = new Day12Student("영희", 14);
        day12Students[2] = new Day12Student("민수" , 16);

        for (Day12Student day12Student :day12Students ) {
            day12Student.introduce();
        }
    }
}
