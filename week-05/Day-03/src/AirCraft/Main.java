package AirCraft;

public class Main {

    public static void main(String[] args) {

        Carrier carrier1 = new Carrier(150, 2000);
        AirCraft F16a = new F16();
        AirCraft F16b = new F16();
        AirCraft F16c = new F16();
        AirCraft F16d = new F16();
        AirCraft F16e = new F16();
        AirCraft F35a = new F35();
        AirCraft F35b = new F35();
        AirCraft F35c = new F35();
        AirCraft F35d = new F35();
        AirCraft F35e = new F35();

        AirCraft F16aa = new F16();
        AirCraft F16bb = new F16();
        AirCraft F16cc = new F16();
        AirCraft F16dd = new F16();
        AirCraft F16ee = new F16();
        AirCraft F35aa = new F35();
        AirCraft F35bb = new F35();
        AirCraft F35cc = new F35();
        AirCraft F35dd = new F35();
        AirCraft F35ee = new F35();

        carrier1.addAirCraft(F16a);
        carrier1.addAirCraft(F16b);
        carrier1.addAirCraft(F16c);
        carrier1.addAirCraft(F16d);
        carrier1.addAirCraft(F16e);
        carrier1.addAirCraft(F35a);
        carrier1.addAirCraft(F35b);
        carrier1.addAirCraft(F35c);
        carrier1.addAirCraft(F35d);
        carrier1.addAirCraft(F35e);

        Carrier carrier2 = new Carrier(170, 4000);

        carrier2.addAirCraft(F16aa);
        carrier2.addAirCraft(F16bb);
        carrier2.addAirCraft(F16cc);
        carrier2.addAirCraft(F16dd);
        carrier2.addAirCraft(F16ee);
        carrier2.addAirCraft(F35aa);
        carrier2.addAirCraft(F35bb);
        carrier2.addAirCraft(F35cc);
        carrier2.addAirCraft(F35dd);
        carrier2.addAirCraft(F35ee);


        System.out.println(carrier1.getCarrierStatus());
        System.out.println();
        System.out.println(carrier2.getCarrierStatus());
        System.out.println();
        carrier1.fill();
        carrier2.fill();
        System.out.println(carrier1.getCarrierStatus());
        System.out.println();
        System.out.println(carrier2.getCarrierStatus());
        carrier1.fight(carrier2);
        System.out.println("\nAfter the fight");
        System.out.println(carrier2.getCarrierStatus());
    }

}
