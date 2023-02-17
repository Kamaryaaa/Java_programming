package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);// for getting char

        System.out.println("You have entered: "+ch);

        System.out.println("Would you like to continue?");
        String answer = input.next();// only for reading single word

        System.out.println("You have entered: "+answer);
        input.close();

        /*
        System.out.println("How are you today?");

        String answer1= input.nextLine();
        System.out.println("You have entered: "+answer1);

         */







    }
}
