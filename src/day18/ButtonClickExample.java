package day18;
import javax.swing.*;
import java.awt.event.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("버튼 클릭 이벤트");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("0");
        JButton button = new JButton("클릭하세요!");


        button.addActionListener(new ActionListener() {
            int i = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("" + ++i);
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
