package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName=input.nextLine().toLowerCase();

        System.out.println("Enter your last name:");
        String lastName=input.nextLine().toLowerCase();


        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        // give you first letter upper case //  give you the rest of the letter

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);

        input.close();



    }
}
/*
Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */