package day27_accessModifier;

public class instanceBlock {

    {
        System.out.println("Instance Block");
    }
    public instanceBlock(){
        System.out.println("Constructor");
    }






    public static void main(String[] args) {
        new instanceBlock();
        new instanceBlock();
        new instanceBlock();


    }
}
