import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class coloredBox {

    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.red);
        graphics.drawLine(10,50,10,150);

        graphics.setColor(Color.cyan);
        graphics.drawLine(10,50,110,50);

        graphics.setColor(Color.blue);
        graphics.drawLine(110,50,110,150);

        graphics.setColor(Color.black);
        graphics.drawLine(10,150,110,150);

        // Extra: draw a house
        graphics.setColor(Color.black);
        graphics.drawLine(180,50,180,150);

        graphics.setColor(Color.black);
        graphics.drawLine(180,50,280,50);

        graphics.setColor(Color.black);
        graphics.drawLine(280,50,280,150);

        graphics.setColor(Color.black);
        graphics.drawLine(180,150,280,150);

        graphics.setColor(Color.black);
        graphics.drawLine(180,50,230,0);

        graphics.setColor(Color.black);
        graphics.drawLine(230,0,280,50);

        // Add a door to the house
        graphics.setColor(Color.black);
        graphics.drawLine(210,150,210,100);

        graphics.setColor(Color.black);
        graphics.drawLine(250,150,250,100);

        graphics.setColor(Color.black);
        graphics.drawLine(210,100,250,100);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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

