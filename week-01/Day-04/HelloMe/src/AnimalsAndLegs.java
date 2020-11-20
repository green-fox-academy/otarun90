import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int chickens;
        int pigs;
        int chickenLegs = 2;
        int pigLegs = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many chickens you have: ");
        chickens = scanner.nextInt();
        System.out.println("Please enter how many pigs you have: ");
        pigs = scanner.nextInt();
        System.out.println("You have: " + (chickens*chickenLegs) + " chicken legs and " + (pigs*pigLegs) + " pig legs");

    }
}
