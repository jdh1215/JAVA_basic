package day15;

public class Day15Abstracts {
    public static void main(String[] args) {

            Teacher[] arr =  new Teacher[3];
            Teacher t = new MoralTeacher("김지연");
            Teacher e = new EnglishTeacher("장은주");
            Teacher s = new ScienceTeacher("김상주");
            arr[0] = t;
            arr[1] = e;
            arr[2] = s;

            for (int i = 0; i < 3; i++) {
                arr[i].teachSubject();
            }

    }
}
