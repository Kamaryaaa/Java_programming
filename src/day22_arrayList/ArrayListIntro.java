package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {


        int [] array = new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        //array[5]=60;
        System.out.println(Arrays.toString(array));
        System.out.println("=======ArrayList=======");
        //        the data type have to be supportive by Array list
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println("The size of the list: "+list.size());




    }
}
