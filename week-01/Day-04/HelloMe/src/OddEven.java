import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        int numberGivenByUser;
        System.out.println("Enter an Integer number:");

        Scanner scanner = new Scanner(System.in);
        numberGivenByUser = scanner.nextInt();

        if ( numberGivenByUser % 2 == 0)
            System.out.println("Entered number is even.");
        else
            System.out.println("Entered number is odd.");
    }
}
