package SumDigit;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        SumDigit newNumber = new SumDigit();
        newNumber.getDigits();

        Random random = new Random();
        int randomNumber = random.nextInt(999);
        System.out.println(randomNumber);
        int number = newNumber.getSumOfDigits(randomNumber);
        System.out.println(number);
    }
}
