package day10;

public class Day10Method {
    public static void main(String[] args) {

        int result = add(1,2);
        System.out.println("result = " + result);

        Day10Cat cat1 = new Day10Cat();
        cat1.name = "dfdf";
        cat1.age = 34;

        Day10Cat cat2 = new Day10Cat("dldh");
        System.out.println(cat2.name);

        Day10Cat cat3 = new Day10Cat(3);
        Day10Cat cat4 = new Day10Cat("fdf", 8);

        cat1.introduceMaster("동휘");
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
