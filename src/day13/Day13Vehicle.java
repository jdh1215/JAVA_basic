package day13;

public class Day13Vehicle {
    private int speed;


    public Day13Vehicle(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("교통수단이 움직입니다. 속도: " + speed + "km/h");
    }
}
