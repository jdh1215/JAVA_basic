package day15;

public class ScienceTeacher extends Teacher{
    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println( name + "가 가르치는 과목은 과학입니다." );
    }
}


