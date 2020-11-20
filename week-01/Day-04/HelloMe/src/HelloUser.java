import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter User Name: ");
        String userName = scanner.next();
        System.out.println("Please enter First Name: ");
        String FirstName = scanner.next();
        System.out.println("Please enter Last Name: ");
        String LastName = scanner.next();
        System.out.println("Hello " + LastName + " " + FirstName + " (" + userName + ") " + "!");
    }
}
