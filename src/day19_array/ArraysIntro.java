package day19_array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        int score1 = 85;
        int score2 = 77;
        int score3 = 90;
        int score4 = 85;
        int score5 = 65;

        System.out.println("====================================");

        int []  scores = new int[5];// index: 0,1,2,3,4
        scores[0]=65;
        scores[2]=85;
        scores[1]=95;
        scores[3]=88;
        scores[4]=77;
//scores[5]=23;// index out of range except
        //scores[-1]=100; index out of range exception
        System.out.println("scores = " + Arrays.toString(scores)  );
        System.out.println(scores[2]);

        System.out.println("==================================");

        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }

        System.out.println(scores[scores.length-1]);










    }
}
