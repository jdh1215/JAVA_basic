package day15;

public class EnglishTeacher extends Teacher{
    public EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println(name + "가 가르치는 과목은 영어 입니다");
    }
}
