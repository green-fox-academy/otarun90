import java.util.Random;
import java.util.Scanner;

public class DivideByZero<nrDividedbyTen> {
    private static void randomNumberDividedByTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give value between 1 to 10");
        int divisor = scanner.nextInt();
        try {
        int result = (10 / divisor);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {

        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        randomNumberDividedByTen();
    }
}
