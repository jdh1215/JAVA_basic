package day10;

public class Day10Cat {
    public String name;
    public int age;

    public Day10Cat() {
    }

    public Day10Cat(String name) {
        this.name = name;
    }

    public Day10Cat(int age) {
        this.age = age;
    }

    public Day10Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("제 이름은" + name + "이고" + age + "살 이에요~");

    }
    public String getName() {
        return name;

    }
    public void introduceMaster(String master) {
        System.out.println("제 주인의 이름은 " + master + "이에요!");
    }



}


