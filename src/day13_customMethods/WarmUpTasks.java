package day13_customMethods;

public class WarmUpTasks {
    public static class ageGroup {
        public static void main(String[] args) {
            ageGroup(-1);

        }
        /*
        2. Create a method named ageGroup that can print the age group of the person

                age groups are:
                        Teenager (< 21)
                        Adult   (>=21 && <55 )
                        Senior  ( > 55 )

         */

        public static void ageGroup(int age){
            String ageGroup="";

            if(age<21&& age>0){
                ageGroup="The age belong to Teenager group";
            } else if (age>=21&&age<55) {
                ageGroup="The age group belong to Adult group";
            }else if(age<=150&&age>=55) {
                ageGroup="The age group belong to Senior";
            }else {
                System.err.println("Invalid age: "+age);
            }
            System.out.println(ageGroup);


        }






    }

    public static class Calculate {
        public static void main(String[] args) {
            calculator(45,34,'*');

        }


        /*
        1. Create a method named calculate that can take three arguments:
                num1 (double)
                num2 (double)
                mathOperator (char)

            The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

                Ex:
                    calculate(10, 20, '+')

                output:
                    10 + 20 = 30

         */
        public static void calculator(double num1, double num2, char mathOperator){
            double result = (mathOperator=='+')?  num1+num2 :(mathOperator=='-')?num1-num2
                    :(mathOperator=='*') ?num1*num2 :num1/num2;
            System.out.println(num1+" "+mathOperator+" "+num2+"="+result);






        }







    }

    public static class eligibleToVote {
        public static void main(String[] args) {
            eligibleToVote(23,true);

        }



        /*
        3. Create a method named eligibleToVote that takes two arguments:
                1. age (int)
                2. isAmerican (boolean)

            Then the method should determine if the person eligible to vote
                Ex:
                    eligibleToVote(23, true)

                output:
                    You are eligible to vote
         */

        public static void eligibleToVote(int age, boolean isAmerican){
            if(age>=18&&isAmerican==true){
                System.out.println("You are eligible to vote in America");
            }else {
                System.out.println("You are not eligible to vote in America");
            }
        }





    }
}
