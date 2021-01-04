package exercise06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Write a Stream Expression to find the uppercase characters in a string!
//        List<String> strings = Arrays.asList("Star","sum","Doom","dAm");
//        System.out.println(strings.stream().filter(string -> !string.equals(string.toLowerCase())));
        String example = "i am a cool Feature searching for Uppercase Characters cause Knowledge is power";

        System.out.println(example.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()));
    }

}
