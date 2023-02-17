package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word =input.next();

        if(word.length()>=1){
            char f = word.charAt(0);
            if(f>=48&&f<=57){
                System.out.println("first character is digit");
            }else if(f>='A'&&f<='Z'){
                System.out.println("first character is upper case letter");
            }else if(f>='a'&&f<='z') {
                System.out.println("first character is lower case letter");
            }else{
                System.out.println("first character is special letter");
            }
        }else {
            System.out.println("String is empty");
        }
        input.close();












    }
}
/*
Create a class named DigitLetterSpecialChar and wirte a program that can ask the user
to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is
	        lowercase letter"
	        - if the word starts with lowercase letters, print "first character is
	        uppercase letter"
	        - if the word starts with special characters, print "first character is
	        special character"


        	HINT: You need to check the ascii table
 */