package day13;

public class Day13Inheritance {
    public static void main(String[] args) {
//        Day13Animal animal = new Day13Animal("일반 동물");
//        animal.makeSound();
//
//        Day13Tiger tiger = new Day13Tiger("호룽이");
//        tiger.makeSound();
//        tiger.hunt();
        Day13Vehicle vehicle = new Day13Vehicle(50);
        vehicle.move();

        Day13Car car = new Day13Car(80 , 10);
        car.move();
        car.refuel();

        Day13Bicycle bicycle = new Day13Bicycle(20);
        bicycle.move();
        bicycle.pedal();
   }

}
