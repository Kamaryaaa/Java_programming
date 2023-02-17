package day08_Ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade='A';

        /*
        A:Excellent
        B:Good job
        C:Good
        D:Passed
        F:Failed

        if(grade=='A'){
       result="Excellent";
   } else if (grade=='B') {
       result="Good job";
   }else if(grade=='C'){
       result="Good";
   } else if (grade=='D') {
       result="Passed";
   }else {
       result="Failed";
   }
        System.out.println(result);

         */

        System.out.println("===========================");
        // data type must match
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Not a valid grade");

        }




    }
}
