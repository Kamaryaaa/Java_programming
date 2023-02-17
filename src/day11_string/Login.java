package day11_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String validUserName="Cydeo";
        String validPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name:");
        String userName = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();

        if(userName.equals(validUserName)&&password.equals(validPassword)){
            System.out.println("You are now logged in");
        }else {
            System.err.println("Incorrect username or password. Please try again");
        }

       input.close();


    }
}
/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password.
				Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */