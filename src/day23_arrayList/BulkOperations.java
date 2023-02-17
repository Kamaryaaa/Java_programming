package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        //list1.addAll(numbers);
        list1.addAll(1,numbers);

        System.out.println("numbers = " + numbers);
        System.out.println("list1 = " + list1);

        System.out.println("=======asList();=========");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,100,70,80));

        System.out.println("scores = " + scores);

        System.out.println("======asList(); String===========");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hassan","Abidullah","Bilal") );
        System.out.println(students);

        students.addAll(2,Arrays.asList("Lale","Sumeye","Tatiana"));

        System.out.println("students = " + students);

        System.out.println("=========================");

        Integer[] nums = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
       // l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("==========addAll();================");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali")  );
        System.out.println("employeeList = " + employeeList);

        boolean hasAlena = employeeList.contains("Alena");
        System.out.println("==========containsAll();================");


        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena","Gadir"));
        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar",
                "Ali","Kuzzat"));
        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("=========removeAll();===========");
        //remove all the matching elements

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println("list = " + list);

        System.out.println("=========retainAll();===========");

        // removing all unmatched elements

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali",
                "Khashavar","Madivar","Muhtar","Muhtar","Alena"));
        developers.retainAll(Arrays.asList("Alena","Khashavar","Muhtar"));
        System.out.println("developers = " + developers);

        System.out.println("==========================");
      ArrayList<String> groceryList= new ArrayList<>();
      groceryList.addAll(
              Arrays.asList("Eggs","Potato","Milk","Tomato","Rice",
                      "Orange","Straberry","Blueberry","Paper towels") );

      groceryList.retainAll(Arrays.asList("Eggs","Potato","Milk","Tomato") );
      //groceryList.removeAll(Arrays.asList("Rice",
              //"Orange","Straberry","Blueberry","Paper towels"));

        System.out.println("groceryList = " + groceryList);






    }
}
