package day12_customMethods;

public class CustomMethodWithParameter {


    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(2);
        oddOrEven(0);

    }
// the method takes an argument number, and verifies if the number is odd number or even number


    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }

// create a method that can check if a person is eligible to buy alcohol(age)

    public static void eligible(int age){
        if(age>=21){
            System.out.println("The person is eligible to buy alcohol");
        }else {
            System.out.println("The person is not eligible to buy alcohol");
        }
    }




    // create a method that can check if a number is odd, or even or zero(number)

    //create a method that can calculate the grade of the students(score)
    // create a method that can display the initials of a person(first name, last name)


    /*create a method that can print the maximum number between two numbers,
    if both are equal then print "Equal"(number1,number2)
     */


}
