package PetrolStation;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Car newCar = new Car();
        Station.refill(newCar);
        System.out.println("The remaining gas amount at the petrol stations is :" + Station.gasAmount);
        System.out.println("The remaining gas amount in the car after the refill is :" + newCar.gasAmount);


    }

}
