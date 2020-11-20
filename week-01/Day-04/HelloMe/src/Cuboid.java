public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
    double length = 50;
    double width = 70;
    double height = 90;
        System.out.println("Volume: " + (length * width * height));
        System.out.println("Surface area: " + (2*((length * width)+(length * height)+(width*height))));
    }
}
