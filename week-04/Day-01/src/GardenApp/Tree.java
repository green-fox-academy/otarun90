package GardenApp;

public class Tree extends Plant {

    public Tree (String color){
        super(color);
    }

    @Override
    protected Double waterAbsorption() {
        return 0.4;
    }

    @Override
    protected String getType() {
        return "Tree";
    }

    @Override
    protected Integer perfectWaterLevel() {
        return 10;
    }

}
