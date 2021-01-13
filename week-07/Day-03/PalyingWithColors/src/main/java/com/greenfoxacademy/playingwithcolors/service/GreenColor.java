package com.greenfoxacademy.playingwithcolors.service;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
//    @Override
//    public void printColor() {
//        System.out.println("It is green in color");
//    }

    @Override
    public String printColor() {
        return "It is green in color";
    }

}
