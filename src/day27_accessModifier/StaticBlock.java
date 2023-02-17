package day27_accessModifier;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }




    public static void main(String[] args) {
        System.out.println("MainMethod");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }
    static{
        System.out.println("Static block");
    }





}
