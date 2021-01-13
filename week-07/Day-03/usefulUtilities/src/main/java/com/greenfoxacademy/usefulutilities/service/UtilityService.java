package com.greenfoxacademy.usefulutilities.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
//        colors.add("red");
//        colors.add("blue");
//        colors.add("lime");
//        colors.add("orange");
//        colors.add("magenta");
        colors.add("https://media4.giphy.com/media/3NtY188QaxDdC/giphy-downsized.gif");
        colors.add("https://data.whicdn.com/images/327855607/original.gif");
        colors.add("https://media0.giphy.com/media/26nfqb8YF9qYj9dTi/200.gif");

        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }


    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

    public Boolean validateEmail(String email){
        boolean containsAt = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                containsAt = true;
            }
            if (containsAt){
                if (email.charAt(i)== '.'){
                    return true;
                }
            }
        }
        return false;
    }

}

