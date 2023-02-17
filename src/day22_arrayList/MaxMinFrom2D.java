package day22_arrayList;

import java.util.Arrays;

public class MaxMinFrom2D {
    public static void main(String[] args) {
        int[][] array = { {100,2000,300},{10, 1000, 50},{-200,400,0} };

        int max = array[0][0];
        int min=array[0][0];

        for (int[] each1D : array) {
            for (int eachElement : each1D) {

                if(eachElement>max) {
                    max = eachElement;
                }
                    if(eachElement<min){
                        min=eachElement;
                    }
                }
            }

        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum Number is: "+min);


    }
}

/*
write a program that can find the minimum and maximum numbers from a
 two-dimensional array of integers
 Ex:
 array = { {100,20,300},{10, 100, 50},{-200,400,0} };

 output:
 Minimum Number is: -200
 Maximum number: 1000

 */
