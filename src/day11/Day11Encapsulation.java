package day11;

public class Day11Encapsulation {
    public static void main(String[] args) {
        Day11AccessModifier example = new Day11AccessModifier();

        System.out.println(example.publicField);


        System.out.println(example.getPrivateField());

        example.setPrivateField("새로운 값");
        System.out.println(example.getPrivateField());
    }

}
