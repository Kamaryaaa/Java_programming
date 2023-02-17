package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        System.out.println("======max();min();================");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList
                (1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("==============sort();======================");
        ArrayList<String> groceryList= new ArrayList<>();
        groceryList.addAll(
                Arrays.asList("Eggs","Potato","Milk","Tomato","Rice",
                        "Orange","Straberry","Blueberry","Paper towels") );

                   Collections.sort(groceryList);
        System.out.println("groceryList = " + groceryList);

        System.out.println("=======reverse();========");
        Collections.reverse(groceryList);
        System.out.println("groceryList = " + groceryList);

        System.out.println("=======swap();========");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hassan","Abidullah","Bilal") );
        System.out.println("students = " + students);

       Collections.swap(students,0,1);
        System.out.println("students = " + students);

        Collections.swap(students,0,students.size()-1);
        System.out.println("students = " + students);









    }
}
