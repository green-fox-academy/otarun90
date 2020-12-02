package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie pen1 = new Sharpie("blue",5);

        System.out.println(pen1.inkAmount);

        do {
            pen1.askToUsePen();
            pen1.use();
        } while (pen1.inkAmount>0);
        pen1.pleaseRefill();

        pen1.chooseToRefill();

    }
}
