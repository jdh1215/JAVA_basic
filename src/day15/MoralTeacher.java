package day15;

public class MoralTeacher extends Teacher{
    public MoralTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println(name + "가 가르치는 과목은 도덕입니다");
    }
}
