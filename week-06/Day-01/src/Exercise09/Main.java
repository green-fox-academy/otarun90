package Exercise09;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    //    Write a Stream Expression to find the frequency of characters in a given string!
    public static void main(String[] args) {
//        String someString = "elephant";
//        long count = someString.chars().filter(ch -> ch == 'e').count();
//        System.out.println(count);

        String example = "Subidubidu itt jon Scooby Doo";

        Map<Character, Long> map = example.chars()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}


