package PiratesV2;

public class Main {

    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Jack", 10, true, false);
        Pirate pirate2 = new Pirate("Joe", 11, false, true);
        Pirate pirate3 = new Pirate("Moe", 12, true, false);
        Pirate pirate4 = new Pirate("Jill", 13, false, false);

        Ship ship = new Ship();
        ship.addPirate(pirate1);
        ship.addPirate(pirate2);
        ship.addPirate(pirate3);
        ship.addPirate(pirate4);
        System.out.println(ship.getGold());
        System.out.println(ship.getPoorPirates());
        ship.getGolds();

        System.out.println(pirate1.toString());
        System.out.println(pirate2.toString());
        System.out.println(pirate3.toString());
        System.out.println(pirate4.toString());


        ship.lastDayOnTheShip();
        System.out.println("Last day on the ship:");
        System.out.println(pirate1.toString());
        System.out.println(pirate2.toString());
        System.out.println(pirate3.toString());
        System.out.println(pirate4.toString());


        ship.prepareForBattle();
        System.out.println("Preparing for battle:");
        System.out.println(pirate1.toString());
        System.out.println(pirate2.toString());
        System.out.println(pirate3.toString());
        System.out.println(pirate4.toString());
        ship.getGolds();

    }

}
