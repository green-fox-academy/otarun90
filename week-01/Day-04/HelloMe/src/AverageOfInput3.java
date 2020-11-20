import java.util.Scanner;

public class AverageOfInput3 {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        double numberOfNumbers = 5;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number and hit enter, this can be done " + (int)numberOfNumbers + " times!"); //if I do not add (int) before numbers, it will display as 5.0

        for (int i = 1; i <= numberOfNumbers; i++) { //If I start i from 0 then it the user can add 6 numbers as the first value of i will be 0 and then 1
            sum += scanner.nextInt();
        }
        double average = (sum/numberOfNumbers);
        System.out.println("Sum: " + sum + ", Average: " + (average));

    }
}
