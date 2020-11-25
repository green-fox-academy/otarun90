import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GoToCenter {

    //public static void random(){
    // define the range
    //int max = 720;
    //int min = 1;
    // range = max - min + 1;

    // generate random numbers within 1 to 10
    //for (int i = 0; i < 720; i++) {
    //   int rand = (int)(Math.random() * range) + min;

    //  } int x;
    //  }


    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        int x;
        int y;
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            x = random.nextInt(720);
            y = random.nextInt(720);
            if (x <= 359) {
                graphics.setColor(Color.CYAN);
            } else if (x >= 360) {
                graphics.setColor(Color.MAGENTA);
            }
            graphics.drawLine(x, y, 360, 360);
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
