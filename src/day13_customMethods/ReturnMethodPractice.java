package day13_customMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

    }

/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */

public static boolean isOdd(int num){
    boolean isOdd=true;
    if(num%2!=0){
        return isOdd=true;
    }else {
        return isOdd=false;
    }

}

public static boolean isEven(int num){
    boolean isEven;
    if(num%2==0){
        return isEven=true;
    }else {
        return isEven=false;
    }

}
/*
public static boolean isEven(int num) {
    return !isOdd((num));
}

 */
public static double max(double num1 ,double num2){
    if(num1>num2){
        return num1;
    }else {
        return num2;
    }
}

public static double min(double num1, double num2){
    if(num1<num2){
        return num1;
    }else {
        return num2;
    }
}














}
