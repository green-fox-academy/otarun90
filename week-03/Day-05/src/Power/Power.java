package Power;

public class Power {

    // Given base and n that are both 1 or more, compute recursively (no loops) the
    // value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public Power () {

    }
    int result;
    public int getPowerN (int x, int y) {
        if (y==1){
            return x;
        } else{
            return getPowerN(x,y-1)*x;
        }
    }

}
