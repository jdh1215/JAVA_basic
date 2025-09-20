package day28;

import java.util.Queue;
import java.util.LinkedList;
public class Day28Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();


        queue.offer("철수");
        queue.offer("영희");
        queue.offer("민수");

        System.out.println("가장 먼저 대기 중 ->" + queue.peek());

        System.out.println("\npoll() 하여 서비스 처리");
        while (!queue.isEmpty()) {
            String name = queue.poll();
            System.out.println(name + "님이 탑승하셨습니다.");
        }

        System.out.println("\n남은 사람 수 ->" + queue.size());
    }
}
