package exercise08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        Write a Stream Expression to concatenate a Character list to a string!
        List<Character> characters = Arrays.asList('N', 'i', 'c', 'e', ' ','T','r','y');
        System.out.println(characters.stream().map(String::valueOf).collect(Collectors.joining()));
    }

}
