package AirCraft;

public abstract class AirCraft {

    protected int ammo;
    protected int maxAmmo;
    protected int baseDamage;

    public AirCraft(){
        this.ammo=0;
    }

    public int damage(){
        return this.ammo*this.baseDamage;
    }
    public int fight(){
        int damageDealt=damage();
        this.ammo=0;
        return damageDealt;
    }

    public int refill(int number){
        if(number>neededAmmo()){
           number-=neededAmmo();
           this.ammo=this.maxAmmo;
           return number;
        }else {
            this.ammo=this.ammo+number;
            return number =0;
        }
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

    public String getStatus(){
        return "Type " + getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + damage() + "\n";
    }

    public int neededAmmo(){
        return this.maxAmmo-this.ammo;
    }

    public abstract boolean isPriority();
}
