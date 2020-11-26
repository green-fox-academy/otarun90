import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FourRectanglesUpgrade {

    public static void drawingCubes(Graphics graphics, int sizeOfCube, int numberOfCubes, Random random, int valueX) {
        int valueY;
        for (int i = 1; i < numberOfCubes; i++) {
            valueX += sizeOfCube + random.nextInt((WIDTH - sizeOfCube * numberOfCubes)/ numberOfCubes);
            valueY = random.nextInt(HEIGHT- sizeOfCube);
            Color color = new Color(random.nextInt(0xFFFFFF));
            graphics.setColor(color);
            if ( 0 <= valueX && valueX <= WIDTH) {
                graphics.fillRect(valueX, valueY, sizeOfCube, sizeOfCube);
            } else {
                System.out.println("Value of X is less than zero or more than 720"); // still not working
            }
        }
    }

    public static void mainDraw(Graphics graphics) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter size of cube!");
        //sizeOfCube = scanner.nextInt();

        /* Drawing the first the cube */
        int sizeOfCube=100;
        int numberOfCubes = 6;  // Still working on the problem that if numberOfCubes * sizeOfCube is bigger than WIDTH then I get error...
        Random random = new Random();
        int valueX = random.nextInt((WIDTH /numberOfCubes)-sizeOfCube); // if i do not subtract sizeOfCube it can be out of bound
        int valueY = random.nextInt(HEIGHT - sizeOfCube);
        graphics.setColor(Color.blue);
        graphics.fillRect(valueX,valueY,sizeOfCube,sizeOfCube);

        /* Drawing the rest of the cubes  */
        drawingCubes(graphics, sizeOfCube, numberOfCubes, random, valueX);

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
