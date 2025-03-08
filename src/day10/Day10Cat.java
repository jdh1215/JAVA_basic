package day10;

public class Day10Cat {
    public String name;
    public int age;
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


