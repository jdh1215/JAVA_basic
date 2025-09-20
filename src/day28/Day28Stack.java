package day28;

import java.util.Stack;

public class Day28Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        stack.push("첫 번째");
        stack.push("두 번째");
        stack.push("세 번째");

        System.out.println("가장 위에 있는 요소 ->" + stack.peek());

        System.out.println("\npop() 하여 출력");
        while ( !stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("\n비었는가?" + stack.isEmpty());
    }
}
