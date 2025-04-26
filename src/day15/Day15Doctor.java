package day15;

public class Day15Doctor extends Employee {
    public Day15Doctor(String name) {
        super(name, "의사");
    }

    public void performDuties() {
        System.out.println(getName() + "이(가) 환자를 진료합니다.");
    }

}
