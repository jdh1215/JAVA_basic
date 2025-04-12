package day14;

public class Day14Polymorphism {
    public static void main(String[] args) {
        Day14ElectronicDevice[] arr = new Day14ElectronicDevice[3];
        Day14Smartphone Smartphone = new Day14Smartphone();
        Day14TV TV = new Day14TV();
        Day14Laptop laptop = new Day14Laptop();
        arr[0] = Smartphone;
        arr[1] = laptop;
        arr[2] = TV;

        for (int i = 0; i < 3; i++) {
            arr[i].turnOn();
        }
        for (int i = 0; i < 3; i++) {
            arr[i].turnOff();
        }
    }
}
