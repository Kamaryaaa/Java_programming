package day05_Operators;

public class LogicalOperator {
    public static void main(String[] args) {

        double salary = 60000;
        int creditScore =650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >=18;
                             //       false                   true           true  ==false
        System.out.println(eligibleForLoan);
        System.out.println("--------------------------");
         age = 18;
         String country = "Japan";

         boolean isEligibleToVote = age >=18 && country =="USA";
        System.out.println(isEligibleToVote);

        String answer = "yes";

        boolean validAnswer = answer =="yes" || answer =="no";

        System.out.println(validAnswer);
        System.out.println("--------------------------");


        char grade ='B';
        boolean passedExam = grade =='A'||grade=='B'||grade=='C'||grade=='D';
        System.out.println(passedExam);
        System.out.println("--------------------------");
        System.out.println(!true);
        String a = "yes";
        boolean yes = a=="yes";
        boolean no = !yes;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("--------------------------");

        int score =65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println(passed);
        System.out.println("failed = " + failed);
        System.out.println("--------------------------");

        System.out.println("---------------------");
        System.out.println( true ==!false && false == !true && true != !true);
            //                   true       &&   true         &&true
            int employee1$salary$ = 12;

            int num1 = 50;
            int num2 = 200;
            num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("--------------------------");


             long a1 =3_000L;
             double b = (float)a1;
             int c = (short)b;
        System.out.println(c %1000);

        System.out.println("--------------------------");
 long a2 =30L;
 short b1 = (short)a2;
        System.out.println(b1);

        System.out.println("--------------------------");

           float a3 =100.459_524f;
           byte b2 = (byte)a3;
           double c2 = b2;
        System.out.println(c2);

        System.out.println("--------------------------");


        System.out.println("5 +2 = " +3+4);
        System.out.println("5+2 = "+(3+4));
        System.out.println("--------------------------");


        System.out.println("Result A" +0+1);
        System.out.println("Result B"+1+2);



    }
}
