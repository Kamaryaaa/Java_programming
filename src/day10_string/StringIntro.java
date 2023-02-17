package day10_string;
import java.util.Scanner;// must import
import java.lang.String;// optional// don't need to import
import java.lang.System;// optional// don't need to import

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";
        input.close();

        System.out.println("+===========================");
       String s1="Cat";
       String s2 ="Dog";

       String s3="Cat";
       String s4="Dog";

        System.out.println(s1==s3 && s2==s4);
        System.out.println("===================");
        String str1=new String("Java");// creates two objects; in a string pool and
        // in a heap(outside string)
        String str2=new String("Java");

        System.out.println(str1==str2);

        System.out.println("====================================");

        String t1="Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1==t2);
        System.out.println(t3==t2);





    }
}
