package day13;

public class Day13Animal {
    private String name;

    public Day13Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + "이 소리를 냅니다.");
    }

    public void eat() {
        System.out.println(name + "이 먹이를 먹습니다.");
    }
}

