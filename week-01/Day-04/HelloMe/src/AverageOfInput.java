import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        int a;
        int b;
        int c;
        int d;
        int e;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add 5 numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        int sum = a + b + c + d + e;
        double average = sum/5. ;
        System.out.println("Sum: " + sum + "," + "Average: " + average);

    }
}
