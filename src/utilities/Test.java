package utilities;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array ={10,20,30,40,50};
        int index =0;
        int[] array2 = ArraysUtility.remove(array,index);
        System.out.println(Arrays.toString(array2));
        System.out.println("+++++++++++++++++");
        double[] array1 ={10.3,20.4,30.555,40.555,50.888};

        int index1 = 4;
        double [] array3 = ArraysUtility.remove(array1,index1);
        System.out.println(Arrays.toString(array3));

        System.out.println("+++++++++++++++++");
         String[] names = {"Aziza","Mohammad", "Zilnaz","Esra"};
         int index2 = 3;

         String [] newName = ArraysUtility.remove(names,index2);
        System.out.println(Arrays.toString(newName));

        System.out.println("+++++++++++++++++");

        char[] ch1 = {'a','c','s','d','f'};
        int index3=2;
        char[] ch2 = ArraysUtility.remove(ch1,index3);
        System.out.println(Arrays.toString(ch2));













    }
}
