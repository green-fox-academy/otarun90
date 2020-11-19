public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        System.out.println("BMI első verzió :" +(massInKg/(heightInM*heightInM)));

        System.out.println("BMI második verzió :" +(massInKg/(Math.pow(heightInM,2))));

    }
}
