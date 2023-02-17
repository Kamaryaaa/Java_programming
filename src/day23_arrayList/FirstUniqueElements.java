package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);

        System.out.println("=======ForFindingTheFirstUniqueElement=======");


        for (Integer element : list) {// get every single element one by one
            int frequency =0;

            for (Integer each : list) {//compare each element to every element
                if(each==element){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
                break;//exiting the loop, after the condition met for the first time;
            }
        }




















    }
}
