package AirCraft;

public class F35 extends AirCraft{

    public F35(){
        super();
        this.maxAmmo=12;
        this.baseDamage=50;
    }

    @Override
    public boolean isPriority() {
        return true;
    }


}
