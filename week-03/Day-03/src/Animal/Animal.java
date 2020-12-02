package Animal;

public class Animal {
    //        Create an Animal class
    //            Every animal has a hunger value, which is a whole number
    //            Every animal has a thirst value, which is a whole number
    //            when creating a new animal object these values are created with the default 50 value
    //            Every animal can eat() which decreases their hunger by one
    //            Every animal can drink() which decreases their thirst by one
    //            Every animal can play() which increases both by one


    int hunger = 50;
    int thirst = 50;

    public void eat() {
        this.hunger-=1;
        System.out.println("Hunger after eating: "+ this.hunger);
    }
    public void drink() {
        this.thirst-=1;
        System.out.println("Thirst after drinking: " + this.thirst);
    }

    public void play() {
        this.hunger+=1;
        this.thirst+=1;

        System.out.println("Hunger after playing: " + this.hunger);
        System.out.println("Thirst after playing: " + this.thirst);

    }

}
