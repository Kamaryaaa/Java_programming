package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);// index number :0
        list.add(20);//1
        list.add(30);//2
        list.add(10);//3
        //list.add(5.5);
        System.out.println("list = " + list);


        list.add(1,15);

        System.out.println("list = " + list);

        list.add(2,25);
        System.out.println("list = " + list);

        System.out.println("======================");


        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println("studentsList size is = " + studentsList.size());
        System.out.println("studentsList = " + studentsList);

        String firstStudent = studentsList.get(0);
        System.out.println("firstStudent = " + firstStudent);

        String lastStudent = studentsList.get(studentsList.size()-1);
        System.out.println("lastStudent = " + lastStudent);





    }
}
