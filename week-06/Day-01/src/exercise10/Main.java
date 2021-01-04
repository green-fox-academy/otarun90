package exercise10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//    Write a Stream Expression to find the foxes with green color!
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//    Write a Stream Expression to find the frequency of foxes by color!
        List<Fox> foxes = Arrays.asList(
                new Fox("Fox1", "green", 2),
                new Fox("Fox2", "yellow", 4),
                new Fox("Fox3", "red", 7),
                new Fox("Fox4", "green", 8),
                new Fox("Fox5", "white", 5),
                new Fox("Fox6", "black", 9)
        );

        System.out.println(foxes.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .map(Fox::getName)
                .collect(Collectors.toList()));

        System.out.println(foxes.stream()
                .filter(fox -> fox.getColor().equals("green")&&fox.getAge()<5)
                .map(Fox::getName)
                .collect(Collectors.toList()));

        System.out.println(foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting())));


    }

}
