package day38_exceptionsContinue;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        System.out.println("Break time!!!");
    }

    public BreakTimeException(String massage){
        super(massage);
    }


}
