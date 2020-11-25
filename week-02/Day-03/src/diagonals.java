import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class diagonals {

    public static void Scanner(int x, int x2,int y, int y2) {


    }

    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        Scanner scanner = new Scanner(System.in);
        int x;
        int x2;
        int y;
        int y2;
        for (int i = 1; i < 5; i++) {
            System.out.println("Please add value for X1 and X2");
            x = scanner.nextInt();
            if (x == 0) {
                graphics.setColor(Color.GREEN);
            } else {
                graphics.setColor(Color.RED);
            }
            x2 = scanner.nextInt();
            System.out.println("Please add value for Y1 and Y2");
            y = scanner.nextInt();
            y2 = scanner.nextInt();
            graphics.drawLine(x, y, x2, y2);
        }

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
