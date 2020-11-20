import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        int numberGivenByUser;
        System.out.println("Please add the number of lines");
        Scanner scanner = new Scanner(System.in);
        numberGivenByUser = scanner.nextInt();

        for (int i = 1; i < (numberGivenByUser + 1); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
