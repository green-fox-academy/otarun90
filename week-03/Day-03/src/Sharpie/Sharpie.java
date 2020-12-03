package Sharpie;
//    Create Sharpie class
//        We should know about each sharpie their color (which should be a string),
//        width (which will be a floating point number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;
    static String yes = "YES";
    static String no = "NO";
    static String quit = "QUIT";
    float inkUsage = 0;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void askToUsePen() {
        System.out.println("Please enter a value from 1 to 100, this will determine how much ink will be used:");
        Scanner scanInkUsed = new Scanner(System.in);
        inkUsage = scanInkUsed.nextFloat();
        if (inkAmount - inkUsage < 0) {
            System.out.println("There is less ink left then the amount you want to use, please try again");
            askToUsePen();
        }
    }

    public void use() {
        this.inkAmount -= inkUsage;
        System.out.println("The amount of ink left in the Sharpie after using it: " + this.inkAmount);
    }

    public void refill() {
        this.inkAmount = 100;
        System.out.println("The amount of ink after refilling: " + this.inkAmount);
    }

    public void pleaseRefill() {
        System.out.println("Please refill,Sharpie is empty");
    }

    public void chooseToRefill() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("The sharpie is empty!");
        System.out.println("Please choose whether you want to refill or not: ");
        System.out.println("YES to refill and NO to refill later or you can quit with QUIT");
        String yesOrNo = scanner.next();

        if (yesOrNo.equals(yes)) {
            refill();
            game();
        } else if (yesOrNo.equals(no)) {
            System.out.println("Not a wise decision.....GAME OVER....start again");
            refill();
            game();
        } else if (yesOrNo.equals(quit)) {
            System.out.println("You chose to quit, BYE-BYE");
        } else {
            System.out.println("Invalid command, try again");
            chooseToRefill();
        }
    }

    public void game() {
        do {
            askToUsePen();
            use();
        } while (inkAmount > 0);
        pleaseRefill();
        chooseToRefill();
    }

}


