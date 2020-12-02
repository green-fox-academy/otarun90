package Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();

        System.out.println("Hunger: " + dog.hunger);
        System.out.println("Thirst: " + dog.thirst);

        dog.eat();
        dog.drink();
        dog.play();
    }
}
