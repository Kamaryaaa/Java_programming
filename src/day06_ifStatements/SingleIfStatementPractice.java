package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number%2==0;
        boolean isOdd = !isEven;

        if(isEven){
            System.out.println(number+" is even number: "+isEven);
        }
        if(isOdd){   // if(!isEven){}
            System.out.println(number+" is odd number: "+isOdd);
        }

        System.out.println("===================================");// another solution:

        if(number%2==0){
            System.out.println(number+" is even number: "+isEven);
        }
        if(number%2 !=0){
            System.out.println(number+" is odd number: "+isOdd);


        }



    }
}
