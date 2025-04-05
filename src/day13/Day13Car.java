package day13;

public class Day13Car extends Day13Vehicle{

    public int fuel;

    public Day13Car(int speed, int fuel) {
        super(speed);
        this.fuel = fuel;
    }

    public void refuel() {
        System.out.println("자동차가 연료를 충전합니다. 남은 연료: " + fuel );
    }
}
