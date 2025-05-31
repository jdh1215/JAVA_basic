package day18;

import javax.swing.*;

public class DirectActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("직접 ActionListener 구현");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton button = new JButton("클릭하세요!");

        MyActionListener myActionListener = new MyActionListener();

        button.addActionListener(myActionListener);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
