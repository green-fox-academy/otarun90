package AirCraft;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Carrier {
    int ammoStorage;
    int health;
    ArrayList<AirCraft> storage = new ArrayList<>();

    public Carrier(int ammoStorage, int health) {
        this.ammoStorage = ammoStorage;
        this.health = health;
    }

    public void addAirCraft(AirCraft aircraft) {
        storage.add(aircraft);
    }


    public void fill(){
        fillPriority();
        fillNotPriority();
    }

    public void fillNotPriority() {
        for (AirCraft aircraft : storage) {
            if (this.ammoStorage == 0) {
                System.out.println("There's no ammo to refill the Aircrafts!");
                break;
//        elvileg ez kellene de ez olyan bleeee    throw new IllegalArgumentException("There's no ammo to refill the Aircrafts!");
            } else {
                if (!aircraft.isPriority() && aircraft.neededAmmo()!=0) {
                    this.ammoStorage = (aircraft.refill(this.ammoStorage));
                }
            }
        }

    }

    public void fillPriority() {
        for (AirCraft aircraft : storage) {
            if (this.ammoStorage == 0) {
                System.out.println("There's no ammo to refill the Aircrafts!");
                break;
            } else {
                if (aircraft.isPriority() && aircraft.neededAmmo()!=0) {
                    this.ammoStorage = (aircraft.refill(this.ammoStorage));
                }
            }
        }

    }

//    public void fill (){
//        int neededAmmoSum=0;
//        for (AirCraft aircraft: storage) {
//            neededAmmoSum+=aircraft.neededAmmo();
//        }
//        for (AirCraft aircraft: storage){
//            if (this.ammoStorage!=0){
//                if (aircraft.isPriority() && aircraft.ammo!=aircraft.maxAmmo ){
//                    this.ammoStorage=aircraft.refill(this.ammoStorage);
//                } else{
//                    this.ammoStorage=aircraft.refill(this.ammoStorage);
//                }
//            } else {
//                throw new IllegalArgumentException("There's no ammo to refill the Aircrafts!");
//            }
//        }
//    }

    public void fight(Carrier otherCarrier) {
        if (otherCarrier.health>this.carrierDamage()){
        otherCarrier.health -= this.carrierDamage();
        } else {
         otherCarrier.health=0;
        }
    }


    public int carrierDamage() {
        int damageSum = 0;
        for (AirCraft aircraft : storage) {
            damageSum += aircraft.damage();
        }
        return damageSum;
    }

    public String getCarrierStatus() {
        if (this.health == 0) {
            return "It's dead Jim :(";
        } else {
            return "HP: " + this.health + ",Aircraft count: " + this.storage.size()
                    + ", Ammo Storage: " + this.ammoStorage + ", Total damage: " + this.carrierDamage() + "\n" + "Aircrafts:" + "\n" + this.airCraftStatus();
        }
    }

    public String airCraftStatus() {
        String status = "";
        for (AirCraft aircraft : storage) {
            status += aircraft.getStatus();
        }
        return status;
    }
}
