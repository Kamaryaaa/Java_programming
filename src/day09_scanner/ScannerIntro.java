package day09_scanner;
import java.util.Scanner;  // just import one class

// import java.util.*;// import every class in the package

public class ScannerIntro {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);// for reading user inputs
        //input.close();
        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();
        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();
        System.out.println("Enter your third number: ");
        int num3= input.nextInt();
        System.out.println("Enter your forth number: ");
        long num4 = input.nextLong();
        input.close();// scanner is closed;can not read user input

        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);
        System.out.println("Forth number: "+num4);
       // System.out.println("Fifth number: " +num5);



    }
}
