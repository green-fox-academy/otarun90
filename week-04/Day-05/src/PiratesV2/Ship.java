package PiratesV2;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private ArrayList<Pirate> pirates;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public void addPirate(Pirate pirate) {
        if (!pirate.isCaptain()) {
            pirates.add(pirate);
        } else {
            boolean foundCaptain = false;
            for (int i = 0; i < pirates.size(); i++) {
                if (pirates.get(i).isCaptain()) {
                    foundCaptain = true;
                    break;
                }
            }
            if (!foundCaptain) {
                pirates.add(pirate);
            } else {
                System.out.println("There is already a captain on the ship!");
            }
        }
    }


    public List<String> getPoorPirates() {
        List<String> poorPirates = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            if (pirates.get(i).hasWoodenLeg() && pirates.get(i).getGold() < 15) {
                poorPirates.add(pirates.get(i).getName());
            }
        }

        return poorPirates;
    }

    public int getGold() {
        int sum = 0;
        for (int i = 0; i < pirates.size(); i++) {
            sum += pirates.get(i).getGold();
        }

        return sum;
    }

    // ez is jo
    public void getGolds() {
        int sum = 0;
        for (Pirate pirate : pirates) {
            sum += pirate.getGold();
        }
        System.out.println(sum);
    }


//    public void lastDayOnTheShip() {
//        for (int i = 0; i < pirates.size(); i++) {
//            pirates.get(i).party();
//        }
//    }

//    public void prepareForBattle() {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < pirates.size(); j++) {
//                pirates.get(i).work();
//            }
//        }
//        lastDayOnTheShip();
//    }

    public void lastDayOnTheShip() {
        for (Pirate pirate : pirates) {
            pirate.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate pirate : pirates) {
            for (int i = 0; i < 5; i++) {
                pirate.work();
            }
        }
        lastDayOnTheShip();
    }
}
