package day14;

public class Day14Smartphone extends Day14ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("스마트폰이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰이 꺼졌슴니다.");
    }
}
