package day12_customMethods;

public class CustomMethodIntro {

    public static void main(String[] args){
        System.out.println("********Test Started**********");

        greetings();
        System.out.println("********Test Completed**********");
        System.out.println("--------------------------------");
        displayMessage();

    }

    public static void greetings(){

        System.out.println("\tHello Cydeo");
        System.out.println("\tHow are you today?");
        System.out.println("\tAre you ready to learn Java?");

    }

    public static void displayMessage(){

        System.out.println("Hello world");
        System.out.println("I love Java");

    }


}
