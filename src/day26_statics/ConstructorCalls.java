package day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        System.out.println("Constructor with string argument");
    }



    public static void main(String[] args) {



        method1();

        System.out.println("=======================");

        method2();




    }




    public static void method1(){
        System.out.println("Method1");
        //ConstructorCalls();
        //this();

    }
    public static void method2(){
        method1();
        System.out.println("Method2");

    }




}
