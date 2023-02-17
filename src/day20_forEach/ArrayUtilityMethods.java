package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int [] score = {70,100,80,90,65};
        System.out.println("=======toString======");

        System.out.println("score= "+Arrays.toString(score));
        String result = Arrays.toString(score);
        System.out.println("result= " + result);

        System.out.println("=======equals()=======");

        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2);
        System.out.println("r1 = " + r1);

        char[] ch1 = {'A','B','C'};
        char [] ch2 = {'A','C','B'};

        boolean c1 = Arrays.equals(ch1,ch2);
        System.out.println("b1 = " + c1);

        String [] s1 = {"A","B","C"};
        String [] s2 = {"A","C","B"};
        System.out.println(Arrays.equals(s1,s2));

        System.out.println("=======sort()=======");

        int [] nums = {100,80,90,75,88,99,0,5,4,100,500};
        System.out.println("before sorting: "+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
        System.out.println("Minimum number: "+nums[0]);
        System.out.println("Maximum number: "+nums[nums.length-1]);

        System.out.println("=======sort()=======");
           String[] b1 = {"A","B","C"};
        String[] b2 = {"B","C","A"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1,b2));

        System.out.println("=======sort()=======");

        String[] students = {"Yaxier","Madiyar", "Ali","Abidulaah","Alena"};
        System.out.println("before sorting: "+Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("after sorting: "+Arrays.toString(students));

        System.out.println("=======copyOf()=======");

        int [] array = {10,20,30,40,50,60,70};

        int [] array2 =Arrays.copyOf(array, 4);
        System.out.println(Arrays.toString(array2));
        int [] array3 =Arrays.copyOf(array, 7);
        System.out.println(Arrays.toString(array3));
        int [] array4 =Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array4));
        System.out.println("=======copyOf()=======");
     int [] n1 = {1,2,3,4,5};
     int[] n2 = {6,7,8,9,0,10,11,12};

     int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);
        for (int i = 0,j=n1.length; i <n2.length ; i++,j++) {
            n3[j]=n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("=======copyOf()=======");

        char [] ch = {'A','B','C','D','E','F','G'};

        char[] result1 = Arrays.copyOf(ch,9);
        System.out.println(Arrays.toString(result1));

        System.out.println("=======copyOfRange()=======");
        char[] result2 = Arrays.copyOfRange(ch,2,5); //exclude ending index
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length);
        System.out.println(Arrays.toString(result3));




























    }
}
