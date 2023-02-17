package day37_exceptions;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println("Program1 started");

        try{
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace();// display full detail of the exception after the excution of program
        }

        System.out.println("Program1 ended");
        System.out.println("===================================");

        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }











    }
}
