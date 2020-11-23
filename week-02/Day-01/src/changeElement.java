import java.util.Arrays;

public class changeElement {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element

        int[] numbers = {1, 2, 3, 8, 5, 6};
        System.out.println("Numbers in the array: " + Arrays.toString(numbers));
        System.out.println("Value of fourth element: " + numbers[3]);
        numbers[3]= 4;
        System.out.println("Value of fourth element: " + numbers[3]);
    }
}
