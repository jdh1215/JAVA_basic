package day28;

import java.util.ArrayDeque;
import java.util.Deque;

public class Day28Deque {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("첫 손님");
        deque.addLast("마지막 손님");
        deque.addFirst("VIP 손님");

        System.out.println("앞 첫 번째 ->" + deque.peekFirst());
        System.out.println("뒤 첫 번째 ->" + deque.peekLast());

        System.out.println("\n남은 손님 수 ->" + deque.size());
    }
}
