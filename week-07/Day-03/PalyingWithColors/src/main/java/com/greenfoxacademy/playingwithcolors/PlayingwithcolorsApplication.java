package com.greenfoxacademy.playingwithcolors;

import com.greenfoxacademy.playingwithcolors.service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayingwithcolorsApplication implements CommandLineRunner {

    private static MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(PlayingwithcolorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myColor.printColor());
    }

    @Autowired
    PlayingwithcolorsApplication(MyColor myColor){
        this.myColor = myColor;
    }
}
