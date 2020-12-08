package GardenApp;

public abstract class Plant {
    protected double waterLevel;
    //protected String type;
    protected String color;

    public Plant() {

    }

    public Plant(String color) {
        this.waterLevel = 0.0;
        //this.type = "Plant";
        this.color = color;

    }

    protected Integer perfectWaterLevel() {
        return 0;
    }

    public boolean doesNeedWater() {
        if (waterLevel < perfectWaterLevel()) {
            return true;
        }
        return false;
    }

    public void wateringStatus() {
        if (doesNeedWater()) {
            System.out.println("The " + color + " " + getType() + " needs water.");
        } else {
            System.out.println("The " + color + " " + getType() + " doesn't need water.");
        }
    }

    protected void absorbWater(Double amount) {
        waterLevel += amount * waterAbsorption();
    }

    protected abstract Double waterAbsorption();
    protected abstract String getType();
}


