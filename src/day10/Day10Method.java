package day10;

public class Day10Method {
    public static void main(String[] args) {

        int result = add(1,2);
        System.out.println("result = " + result);

        Day10Cat cat1 = new Day10Cat();
        cat1.name = "dfdf";
        cat1.age = 34;

        cat1.introduceMaster("동휘");
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
