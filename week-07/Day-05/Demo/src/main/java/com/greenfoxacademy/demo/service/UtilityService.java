package com.greenfoxacademy.demo.service;

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
//        colors.add("https://media4.giphy.com/media/3NtY188QaxDdC/giphy-downsized.gif");
//        colors.add("https://data.whicdn.com/images/327855607/original.gif");
//        colors.add("https://media0.giphy.com/media/26nfqb8YF9qYj9dTi/200.gif");
        colors.add("/background/7443a31b6a19e5630b94a6538ff9bdd1.gif");
        colors.add("/background/402001120_PAPER_HEARTS_400px.gif");
        colors.add("/background/original.gif");

        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }


}
