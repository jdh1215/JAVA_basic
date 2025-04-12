package day13;

public class Day13Lion  extends Day13Animal{
    public Day13Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println("사자가 크게 으르렁거립니다!");
    }

    @Override
    public void makeSound() {
        System.out.println("으르렁");
    }
}
