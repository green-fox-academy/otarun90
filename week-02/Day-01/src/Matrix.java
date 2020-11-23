import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array
        int numberOfRows = 4;
        int numberOfColumns = 4;
        int[][] arrayMatrix = new int[numberOfRows][numberOfColumns];
        //int[][] arrayMatrix = new int[4][4];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                if (i != j) arrayMatrix[i][j] = 0;  //minden erteknek van egy helyerteke is, ami ebben az esetben 00 01 02 03, aztan 10 11 12 13, a lenzeg, hogy most arra hivatkozunk, hogy ha a helyertek 2 karaktere nem egyenlo akkor az ertek 0 lesz, es ellenkezo esetben pedig 1
                else arrayMatrix[i][j] = 1;
            }
        }
        for (int i = 0; i < arrayMatrix.length ; i++) {
            for (int j = 0; j <arrayMatrix.length ; j++) {
                System.out.print(arrayMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

