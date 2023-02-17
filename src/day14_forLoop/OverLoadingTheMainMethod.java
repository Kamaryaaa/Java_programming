package day14_forLoop;

public class OverLoadingTheMainMethod {  // can overload the main method, but we should not overload the main method
    public static void main(String[] args) {
        main(25);
        main(2.0);
        main(true);
    }

    public static void main(int args){
        System.out.println("a");

    }
    public static void main(double args){
        System.out.println("b");

    }public static void main(boolean args){
        System.out.println("c");

    }


}
