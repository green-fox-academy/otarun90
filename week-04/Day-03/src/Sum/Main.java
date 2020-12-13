package Sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sum sumTest = new Sum();

        //int result = sumTest.sum(Arrays.asList(4,5,7));

        System.out.println(sumTest.sum(Arrays.asList(4,5,7)));

        System.out.println(sumTest.sum(Arrays.asList()));

        System.out.println(sumTest.sum(Arrays.asList(null)));

    }

}
