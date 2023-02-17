package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {


        int [] array = {1,2,3,4,5};

        array[0]=100;

        System.out.println(Arrays.toString(array));

        System.out.println("===========ForUpdatingElementsInArrayList================");
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("paper Towels");
        groceryList.add("Apples");
        groceryList.add("Cooking oil");

        System.out.println(groceryList);

         //groceryList[2]="Oranges";
        groceryList.set(2,"Oranges");

        System.out.println(groceryList);

        groceryList.add(2,"Chicken");
        System.out.println(groceryList);

        System.out.println("=======Remove();=======");

        groceryList.remove(0);
        System.out.println(groceryList);

        groceryList.remove("paper Towels");
        System.out.println(groceryList);

        System.out.println("=======Remove();Integer=======");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        //numbers.remove(20);// 20 is index number, not the element itself
        boolean remove = numbers.remove(Integer.valueOf(10));
        System.out.println(remove);
        System.out.println(numbers);
        System.out.println("=======clear();=======");
           numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("========indexOf();lastIndexOf();=============");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        System.out.println(names.indexOf("Vasyl"));// the first matching element's index number
        System.out.println(names.lastIndexOf("Vasyl"));// the last matching element's index number
        System.out.println(names.lastIndexOf("Sumeye"));


        System.out.println("=======contains();=======");

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");
        System.out.println("hasAli = " + hasAli);
        System.out.println("hasMuhtar = " + hasMuhtar);

        System.out.println("=======equals();=======");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2);

        System.out.println(l1.equals(l2));

        System.out.println("====================");
    ArrayList<Integer> n1 = new ArrayList<>();
    n1.add(10);
    n1.add(20);
    n1.add(30);


        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());














    }
}
