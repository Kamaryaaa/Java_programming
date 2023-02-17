package day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {
        initials("Ali","muhammad");

        initials("Mohamad","Karim");

        initials("Ayhan","Tora");


    }

    public static void initials(String firstName,String lastName){
        firstName=firstName.toUpperCase();
        lastName=lastName.toUpperCase();

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("Initial is: "+initial);

    }



    /*create a method that can print the maximum number between two numbers,
    if both are equal then print "Equal"(number1,number2)
     */

    public static void maxNum(double num1,double num2){

        if(num1>num2){
            System.out.println(num1+" is the maximum number");
        }else if(num2>num1){
            System.out.println(num2+" is the maximum number");
        }else {
            System.out.println(num1+" and "+num2+" is equal");
        }



    }



}
