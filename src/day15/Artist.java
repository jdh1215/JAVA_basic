package day15;

public class Artist extends Employee {
    public Artist(String name, String role) {
        super(name, role);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 그림을 그립니다.");
    }
}
