public class Doubling {
    public static int doublingNumber (int number) {
        return number * 2;

        // masik verzio:
        // int result = number = *2;
        // return result;

    }
    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        int baseNum = 123;
        System.out.println(doublingNumber(baseNum));
    }
}
