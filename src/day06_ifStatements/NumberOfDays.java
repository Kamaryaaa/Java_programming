package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int n =11;
        boolean has28Days = n==2;// if the month number is 2 (Feb) then it has 28 days.
        boolean has30Day = n ==4 ||n==6||n ==9 ||n==11;
        boolean has31Day = !has30Day &&!has28Days;
        String result="";
        if(has28Days){
            result="28 days";

            //System.out.println("28 days");

        }
        if(has30Day){

            result ="30 Days";

            //System.out.println("30 days");
        }
        if(has31Day){

            result ="31 days";


            //System.out.println("31 days ");
        }
        System.out.println(result);

    }
}

/*
2. An integer variable named month is declared and given, Write a program that can print the number of days in the given month
	Ex:
	     Given:
		number = 1
	     output:
		31 days
       Hints:
	 Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
	 Months that has 30 days are: 4, 6, 9, 11
	 Month that has 28 days: 2
 */