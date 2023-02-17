package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {


        Car car=null;
        System.out.println("Program1 started");

        try{
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Forth catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch Block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");




    }
}
