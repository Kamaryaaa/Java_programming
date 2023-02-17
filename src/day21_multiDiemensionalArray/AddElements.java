package day21_multiDiemensionalArray;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array={10,20,30,40,50,60,70,80};
        int element = 90;
        //{1,2,3,4,5,6};

        int[] new_array = Arrays.copyOf(array,array.length+1);
         new_array [new_array.length-1]=element;
        System.out.println(Arrays.toString(new_array));








    }
}
