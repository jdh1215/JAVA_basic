package day16;

public class Day16Interface {
    public static void main(String[] args) {
//        Flyable bird = new Bird();
//        Swimable fish = new Fish();
//        Duck duck = new Duck();
//
//        bird.fly();
//        fish.swim();
//        duck.swim();
//        duck.fly();
        Attackable warrior = new Warrior();
        Mage mage  = new Mage();
        Healable Priest = new Priest();

        warrior.attack();
        mage.heal();
        mage.attack();
        Priest.heal();
    }
}
