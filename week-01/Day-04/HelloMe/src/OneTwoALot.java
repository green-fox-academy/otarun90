import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        int numberGivenByUser;
        System.out.println("Please enter an Integer Number!");

        Scanner scanner = new Scanner(System.in);
        numberGivenByUser = scanner.nextInt();

        if (numberGivenByUser <= 0) {
            System.out.println("Not enough");
        } else if (numberGivenByUser == 1) {
            System.out.println("One");
        } else if (numberGivenByUser == 2) {
            System.out.println("Two");
        } else if (numberGivenByUser > 3) {
            System.out.println("A lot");
        }


    }

}
