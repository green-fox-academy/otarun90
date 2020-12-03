package CounterTesting;

public class Counter {

    private int field = 0;
    private int basic = 0;

    public Counter(){
    }

    public Counter (int field){
        this.field = field;
        this.basic = this.field;
    }

    public void add (){
        this.field+=1;
    }
    public void add (int field){
        this.field+=field;
    }

    public int get() {
     return field;
    }

    public void reset() {
        this.field=this.basic;
    }

    public static void main(String[] args) {

    }

}
