package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total =sum(20,40);// sum is a void method, dose not return any data

        int total = addition(10,20);

    }

    /*
    public static void sum(int n1, int n2){

        int result = n1+n2;
    }
    */

    public static int addition(int num1, int num2){
int result = num1+num2;
        return result;
    }


    public static int square(int num)
    {
        int square = num*num;
        return square;
    }

    public static int cube(int num){
        int cube = square(num)*num;
        return cube;
    }


}
