package day13_customMethods;

public class returnStatement {
    public static void main(String[] args) {
        eligible(25);

        System.out.println("============================");
        System.out.println("test1 started");

        boolean exist = true;
        if(exist){
            return;
        }

        System.out.println("Tes1 completed");
        System.out.println("Test2 started");


    }

    public static void eligible(int age){
        if(age<0 || age>150) {
            System.err.println("Invalid age: " + age);
            return;// exist the method
        }
//if the age is invalid, the method this get terminated
        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are  not eligible to buy alcohol");
        }
    }


    public static int multiplication (int n1, int n2){
        int result = n1*n2;
        return result;
    }

}
