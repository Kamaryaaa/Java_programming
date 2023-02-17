package day38_exceptionsContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program1 started");

        //System.out.println((100/0));// throws keyword can't handle unchecked exceptions
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("=======================");

        System.out.println("Program2 started");


            Thread.sleep(3000);


        System.out.println("Program2 ended");

        System.out.println("=======================");

        System.out.println("Program3 started");

        FileInputStream file=new FileInputStream("");
        System.out.println("Program2 ended");













    }
}
