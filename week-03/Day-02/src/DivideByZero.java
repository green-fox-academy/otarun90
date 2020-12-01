import java.util.Random;

public class DivideByZero<nrDividedbyTen> {
    private static void randomNumberDividedByTen() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("The random number is: " + randomNumber);
        int nrDividedbyTen = (randomNumber / 10);
        if (nrDividedbyTen == 0) {
            System.out.println("fail");
        } else {
            System.out.println("Random number divided by ten: " + nrDividedbyTen);
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
