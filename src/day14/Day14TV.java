package day14;

public class Day14TV extends Day14ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV가 꺼졌습니다.");
    }
}
