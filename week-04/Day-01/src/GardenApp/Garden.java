package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    //3rd version DA BEST so far
    //counting plants that needs watering and in another method watering them
    public void watering(Integer amount) {
            for (Plant plant : plants) {
            if (plant.doesNeedWater()) {
                Double amountForEach = Double.valueOf(amount) /  (plantsThatNeedWatering());
                plant.absorbWater(amountForEach);
            }
        }
    }

    public Double plantsThatNeedWatering() {
        Double numberOfPlantsThatNeedsWatering = 0.0;
        for (Plant plant : plants) {
            if (plant.doesNeedWater()) {
              numberOfPlantsThatNeedsWatering++;
            }
        }
        return numberOfPlantsThatNeedsWatering;
    }

    public void gardenWateringStatus() {
        for (Plant plant : plants) {
            plant.wateringStatus();
        }
    }

}

    //2nd version still not the best
//     public List<Plant> plantsToWater(List<Plant>plants){
//         List<Plant> plantsToWater = new ArrayList<>();
//         for (Plant plant : plants) {
//            if (plant.doesNeedWater()) {
//                plantsToWater.add(plant);
//            }
//         }return plantsToWater;
//     }
//
//    public void watering(Integer amount) {
//        System.out.println("Watering with " + amount);
//        List<Plant> plantsToWater = plantsToWater(plants);
//        Double amountForEach = Double.valueOf(amount) / plantsToWater.size();
//        for (Plant plant : plantsToWater) {
//            plant.absorbWater(amountForEach);
//        }
//    }
//


    //1st version definitely not the best solution
//    public List<Plant> plantsToWater(List<Plant> plants) {
//        List<Plant> plantsToWater = new ArrayList<>();
//        addIfNeedsWater(plants, plantsToWater);
//        return plantsToWater;
//    }
//
//    private void addIfNeedsWater(List<Plant> plants, List<Plant> plantsToWater) {
//        for (Plant plant : plants) {
//            if (plant.doesNeedWater()) {
//                plantsToWater.add(plant);
//            }
//        }
//    }

