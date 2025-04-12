package day13;

public class Day13Inheritance {
    public static void main(String[] args) {
        Day13Animal animal = new Day13Animal("일반 동물");
        animal.makeSound();
        animal.eat();

//        Day13Tiger tiger = new Day13Tiger("호룽이");
//        tiger.makeSound();
//        tiger.eat();
//        tiger.hunt();

        Day13Lion Lion = new Day13Lion("사자");
        Lion.eat();
        Lion.roar();
        Lion.makeSound();

        Day13Penguin Penguin = new Day13Penguin("펭구윈");
        Penguin.eat();
        Penguin.swim();
        Penguin.makeSound();
        //Day13Vehicle vehicle = new Day13Vehicle(50);
//        vehicle.move();
//
//        Day13Car car = new Day13Car(80 , 10);
//        car.move();
//        car.refuel();
//
//        Day13Bicycle bicycle = new Day13Bicycle(20);
//        bicycle.move();
//        bicycle.pedal();
  }

}
