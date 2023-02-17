package day06_ifStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

         int number =65;

         boolean isDevisibleBy2= number%2 ==0;
         boolean isDivisibleBy3 = number%3==0;
         boolean isdivisibleBy5 = number%5 ==0;

        System.out.println(number+" is divisible by 2: "+isDevisibleBy2);
        System.out.println(number+" is divisible by 3: "+isDivisibleBy3);
        System.out.println(number+" is divisible by 5: "+isdivisibleBy5);






    }
}

/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */
