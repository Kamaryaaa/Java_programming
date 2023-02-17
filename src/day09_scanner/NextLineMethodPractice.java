package day09_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();// nothing left  in scanner memory

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter yur age: ");
        int age = input.nextInt();

        input.nextLine();// clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();








    }
}
