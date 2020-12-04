package NumberAdder;

import java.sql.NClob;
import java.util.Random;

public class NumberAdder {

    int startingNumber = 1;
    int index = 0;
    int nextNumber = startingNumber + 1;
    Random random = new Random();
    int n = random.nextInt(9);

    public NumberAdder() {

    }

    public void calculator() {

        if (this.index<n){
            this.startingNumber += this.nextNumber;
            this.index++;
            nextNumber++;
            calculator();
        } else {
            System.out.println("Random number: " + n);
            System.out.println(this.startingNumber);
        }

    }


    public int calculator2 (int startingValue){
        if (startingValue == 1){
            return 1;
        } else {
            return startingValue + (calculator2(startingValue-1));
        }

    }

}
