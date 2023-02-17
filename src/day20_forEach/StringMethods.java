package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(ch.length);
        System.out.println(str.length());
        System.out.println("================================");

        String str2 = "Today is a great day to learn Java";
        String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words));
        

        System.out.println("================================");

        String sentence = "I love Java";
        String [] reverseSentence = sentence.split(" ");
        String [] reverse = ArraysUtility.reverse(reverseSentence);
        System.out.println(Arrays.toString(reverse));
        String result = "";
        for (int i = 0; i < reverse.length; i++) {
            result += reverse[i]+" ";
        }
        System.out.println(result);




    }
}
