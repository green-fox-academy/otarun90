package SumDigit;

import java.sql.SQLOutput;
import java.util.Random;

public class SumDigit {

    Random random = new Random();
    int randomNumber = random.nextInt(999);
    int firstDigit = randomNumber;
    int secondDigit = randomNumber;
    int lastDigit = randomNumber;
    int result = 0;

    public SumDigit() {

    }

    public void printRandomNumber() {
        System.out.println(randomNumber);
    }

    public void getDigits() {
        System.out.println("Random number: " + randomNumber);
        if (randomNumber < 9) {
            System.out.println("Random number is :" + randomNumber + " so the sum is also " + randomNumber);
        } else if (randomNumber < 99) {
            firstDigit = randomNumber / 10;
            secondDigit = randomNumber % 10;
            System.out.println("First digit :" + firstDigit + " Second digit: " + secondDigit);
            result = firstDigit + secondDigit;
            System.out.println("Sum: " + result);
        } else {
            firstDigit = randomNumber / 100;
            secondDigit = (randomNumber / 10) % 10;
            lastDigit = randomNumber % 10;
            System.out.println("First digit :" + firstDigit + " Second digit: " + secondDigit + " Last digit: " + lastDigit);
            result = firstDigit + secondDigit + lastDigit;
            System.out.println("Sum: " + result);
        }
    }

    public int getSumOfDigits(int startingNumber) {

        if (startingNumber /10 == 0) {
            return startingNumber;

        } else {
            return getSumOfDigits(startingNumber/10) + (startingNumber % 10);
        }

    }

}
