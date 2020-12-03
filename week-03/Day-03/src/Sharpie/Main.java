package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie pen1 = new Sharpie("blue",5);

        System.out.println(pen1.inkAmount);

        pen1.game();

    }
}
