package day13;

public class Day13Bicycle extends Day13Vehicle{
    public Day13Bicycle(int speed) {
        super(speed);
    }

    public void pedal() {
        System.out.println("자전가가 페달로 밉니다!");
    }
}
