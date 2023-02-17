package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FoeEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
// we can not change the order of iteration in for each loop
        for(int each : numbers){
            if(each%2==0){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("===========UsingForEachLoopToFindMaxAndMinNumber==================");


        int[] nums={100,20,30,40,5,4,3,2,1,1000,300,500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if(each>max){
                max =each;
            }
            if(each < min){
                min=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("===========UsingForEachLoopToMergeArrays==================");

        int [ ] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110,120};

        int [] a3 = new int [a1.length+a2.length];

        int k =0;
        for (int each : a1) {
            a3[k++]=each;

        }
        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("===========UsingForEachLoopToGetInitials==================");

        String [] names = {"Mohammad Karimi", "Vasyl Dobrianski","Gadir Ibrahimoy", "Abidullah Rahimi"};
        for (String each : names) {  //data type must be match with the element's data type
            System.out.println(each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1));
        }










    }
}
