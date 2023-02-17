package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i=5; i <=10;i++){
            System.out.println("Hello Cydeo"+i);

        }
        System.out.println("Hello world");// never reachable cause given iteration is wrong

           // sum for all the numbers 1~100
           int sum=0;
        for(int number =1; number<=100; number++){
            sum=sum+number;
        }
        System.out.println(sum);
        System.out.println("=================================");

//          print all the letters A~Z
        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //print all the letters in backwards

        for(char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }






    }
}
