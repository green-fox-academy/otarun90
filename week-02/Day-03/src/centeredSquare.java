import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class centeredSquare {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add square value between 10 and " + (WIDTH-10));
        int squareValue = scanner.nextInt();
        int x =(WIDTH-squareValue)/2;
        int y =(HEIGHT-squareValue)/2;
        graphics.drawRect(x,y,squareValue,squareValue);

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
