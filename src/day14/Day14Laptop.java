package day14;

public class Day14Laptop extends Day14ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("노트북이 켜졌습니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("노트북이 꺼졌습니다.");
    }


}
