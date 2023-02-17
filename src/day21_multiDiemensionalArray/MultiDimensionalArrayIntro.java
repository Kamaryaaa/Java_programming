package day21_multiDiemensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 ={1000,2000};
        System.out.println("==============================");
//       index               0  1   2    0  1  2  3  4   0   1
        int[][] array2D = { {10,20,30},{40,50,60,70,80},{90,100},arr4 };
     //index:                  0             1             3
        System.out.println(array2D.length);

        System.out.println(Arrays.toString(array2D[1]));//{40,50,60,70,80}
        System.out.println(Arrays.toString(array2D[2]));//{90,100}
        System.out.println(Arrays.toString(array2D[0]));//{10,20,30}
        System.out.println("====================");

        System.out.println(array2D[2][0]);//90
        System.out.println(array2D[1][2]);//60




    }
}
