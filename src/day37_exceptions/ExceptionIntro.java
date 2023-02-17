package day37_exceptions;

import day37_exceptions.pizzaTask.Pizza;

import java.io.FileInputStream;

public class ExceptionIntro {
    public static void main(String[] args)  {



    String str ="Java";
    //char ch = str.charAt(250);

        //System.out.println("ch = " + ch);// unchecked exception

        //Pizza pizza =null;// unchecked exception
        //pizza.calcCost();

        System.out.println("Hello world");

        System.out.println("==============");

        int score =100;
        if(score>59){
            System.out.println("Your grade is D");
        }else if(score >70){
            System.out.println("Your grade is C");
        }

        System.out.println("================");
        //FileInputStream file=new FileInputStream("");//checked exception

        //Thread.sleep(3000);// checked exception



}



}
