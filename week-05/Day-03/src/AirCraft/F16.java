package AirCraft;

public class F16 extends AirCraft {

    public F16(){
        super();
        this.maxAmmo=8;
        this.baseDamage=30;
    }

    @Override
    public boolean isPriority() {
        return false;
    }

}
