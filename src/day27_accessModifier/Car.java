package day27_accessModifier;

public class Car {

    public String make, model,color;
    public int year;
    public double price;

    public static int wheels =4;


    public class CarEngine{//inner

        public void method(){
            System.out.println(make);
            System.out.println(model);
        }





    }

    public static class StaticInnerClass{



    }







}
