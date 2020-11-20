import java.util.Scanner;

public class AverageOfInput2 {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        double numberOfNumbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the number of numbers you would like to add!");
        numberOfNumbers = scanner.nextInt();


        System.out.println("Please add a number!");
        int i = 1;
        int sum = 0;
        do {
            sum += scanner.nextInt();
            i++;
        } while (i <= numberOfNumbers);

        double average = sum/numberOfNumbers;
        System.out.println("Sum: " + sum + ", Average: " + (average));
    }
}
