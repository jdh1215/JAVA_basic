package day19;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GirdLayout Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 2, 10, 10));

        frame.add(new JButton("버튼 1"));
        frame.add(new JButton("버튼 2"));
        frame.add(new JButton("버튼 3"));
        frame.add(new JButton("버튼 4"));

        frame.setVisible(true);
    }
}
