package day16;

public class Duck implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("오리가 하늘은 납니다.");
    }

    @Override
    public void swim() {
        System.out.println("물고기가 물속을 헤엄칩니다");
    }
}
