package GardenApp;

public class Flower extends Plant {

    public Flower (String color){
        super(color);
    }

    @Override
    protected Double waterAbsorption() {
        return 0.75;
    }

    @Override
    protected String getType() {
        return "Flower";
    }

    @Override
    protected Integer perfectWaterLevel() {
        return 5;
    }

}
