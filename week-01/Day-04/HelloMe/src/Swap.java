public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Value of a before swap: " + a);
        System.out.println("Value of b before swap: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);

    }
}
