import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class triangleMatReview {

       public static void mainDraw(Graphics graphics) {
           // Draw a box that has different colored lines on each edge.

           graphics.setColor(Color.CYAN);
           graphics.fillPolygon(new int [] {20,700,360}, new int [] {700,700,20},3);

           graphics.setColor(Color.BLACK);
           graphics.drawPolygon(new int [] {20,700,360}, new int [] {700,700,20},3);

           //smaller triangles
           graphics.setColor(Color.BLACK);
           graphics.drawPolygon(new int [] {360,190,((720/2)+((360-20)/2))}, new int [] {700,360,360},3);
       }

    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
