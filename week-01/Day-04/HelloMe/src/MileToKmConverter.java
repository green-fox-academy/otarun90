import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        double distanceInMiles;
        double convertValue = 1.609344;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter distance in miles: ");
        distanceInMiles = scanner.nextDouble();
        double distanceInKilometers = distanceInMiles * convertValue;
        System.out.println("Entered distance in miles: " + distanceInMiles);
        System.out.println("Entered distance in kilometers: " + distanceInKilometers);

    }
}
