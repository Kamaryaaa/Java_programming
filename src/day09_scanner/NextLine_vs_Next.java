package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();//45+enter

            input.nextLine();// for clearing the scanner memory
        System.out.println("Enter your full name: ");

        String fullName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);




    }
}
