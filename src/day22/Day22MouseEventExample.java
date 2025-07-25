package day22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Day22MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("마우스 이벤트 예제");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("마우스르르 클릭하거나 드래그 해보세요!", 50, 50);
            }
        };

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseclicked: " + e.getPoint());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed: " + e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mousereleased: " + e.getPoint());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseeEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("ouseExited");
            }
        });

        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mousedragged: " + e.getPoint());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("mouseMoved: " + e.getPoint());
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
