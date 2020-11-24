import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameList {


    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        //        Print out the number of elements in the list
        //        Add William to the list ok
        //        Print out whether the list is empty or not ok
        //        Add John to the list ok
        //        Add Amanda to the list ok
        //        Print out the number of elements in the list ok
        //        Print out the 3rd element
        //        Iterate through the list and print out each name
        //              William
        //              John
        //              Amanda
        //        Iterate through the list and print
        //              1. William
        //              2. John
        //              3. Amanda
        //        Remove the 2nd element
        //        Iterate through the list in a reversed order and print out each name
        //        Amanda
        //        William
        //        Remove all elements
        String enter = "\n";
        List<String> listOfNames = new ArrayList<>();

        System.out.println(listOfNames+enter);

        listOfNames.add("William");

        System.out.println(listOfNames.isEmpty()+enter);  // printing out whether it is empty or not

        listOfNames.add("John");
        listOfNames.add("Amanda");

        System.out.println(listOfNames.size()+enter); // printing out number of elements

        System.out.println(listOfNames.get(2)+enter); //printing out number 3rd element

        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(i));
        } System.out.println(); // ebben az esetben hasznalhatok sima println-t is mert ugyanaz az eredmeny mintha \n-t hasznalnek

        for (int i = 0; i < listOfNames.size(); i++) {
            String placeInList = i + 1 + ". " + listOfNames.get(i);
            System.out.println(placeInList);
        } System.out.print(enter);

        listOfNames.remove(1);

        Collections.swap(listOfNames,0,1);
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(i));
        } System.out.println();

        listOfNames.clear();
        System.out.println(listOfNames);


    }

}
