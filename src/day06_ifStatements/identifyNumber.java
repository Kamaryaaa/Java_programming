package day06_ifStatements;

public class identifyNumber {
    public static void main(String[] args) {

        int number =-200;

        boolean isPositive = number>0;// if the number greater than zero,
        // the number is positive number
        boolean isNegative=number<0; //if the number less than zero,
        // the number is negative number
        boolean isZero = number ==0;// if the number is zero,then it is zero
        // boolean isZero = !isPositive && isNegative;// if the number is not posive and not negative, then this number is zero.

        System.out.println(number+" is positive number: "+isPositive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+" is zero: "+isZero);












    }
}
        /*int number = 0;
         boolean positiveNumber = number>0;    // boolean positiveNumber =true;
         boolean negativeNumber = number <0;    // boolean negativeNumber = false;
         boolean zero = number==0 ;

         if(positiveNumber){
             System.out.println(number+" is positive number"+positiveNumber);

         }else {
             System.out.println(number+" is negative number: "+negativeNumber);

         }




/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */