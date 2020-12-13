package PiratesV2;

public class Pirate {

    private String name;
    private Integer gold;
    private Integer health;
    private boolean hasWoodenLeg;
    private boolean isCaptain;

//    public Pirate(){}

    public Pirate (String name, Integer gold, boolean hasWoodenLeg, boolean isCaptain){
        this.name = name;
        this.gold = gold;
        this.hasWoodenLeg = hasWoodenLeg;
        this.isCaptain = isCaptain;
        this.health = 10;
    }

    public void work (){
        if (this.isCaptain){
            this.gold+= 10;
            this.health-= 5;
        }else{
            this.gold++;
            this.health--;
        }
    }

    public void party (){
        if (this.isCaptain){
            this.health+= 10;
        }else{
            this.health++;
        }
    }

    public String toString(){
        if (this.hasWoodenLeg){
            return "Hello, I'm " + this.name + " . I have a wooden leg and " + this.gold + " golds.";
        } else {
            return "Hello, I'm " + this.name + " . I still have 2 legs and " + this.gold + " golds.";
        }
    }

    public boolean isCaptain(){
        return isCaptain;
    }

    public int getGold(){
        return gold;
    }

    public String getName(){
        return name;
    }

    public boolean hasWoodenLeg(){
        return hasWoodenLeg;
    }


}
