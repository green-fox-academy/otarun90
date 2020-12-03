package Dominoes;

public class Domino {

    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public void checkRightAndLeftSide () {
        int j = 0;
        do {
            for (int i = 0; i < 6 ; i++) {
               if (getRightSide()==getLeftSide()) {
                   j = i;
               }
            }
        }while (getLeftSide()!=getLeftSide());
    }

}
