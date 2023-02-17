package day19_array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] number = new int[5];

        int[] nums={1,2,3,4,5};

        System.out.println(number.length);
        System.out.println(nums.length);

        System.out.println("numbers= "+Arrays.toString(number));
        System.out.println("nums= "+Arrays.toString(nums));

        System.out.println("============================");

        String [] days={"Monday","Tuesday","Thursday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"};
     int n=1;
        System.out.println(days[n-1]);
        System.out.println("-------------------------");

        String [] month = {"Jan","Feb","Mar","Apr","May",
                "Jun","Jul","Aug","Sep","Oct","Nov","Dec"};


        System.out.println("month = " + Arrays.toString(month));

        System.out.println("=========================================");
        for (int i = month.length - 1; i >= 0; i--) {
            System.out.print(month[i]+" ");
        }


    }
}
