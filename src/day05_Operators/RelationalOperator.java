package day05_Operators;

public class RelationalOperator {
    public static void main(String[] args) {


        int a = 1000;
        int b = 200;

        // System. out.println(a>b);

        boolean aIsGreater = a>b;

        System.out.println(aIsGreater);

        System.out.println("-----------------------------");

        int score =75;
        boolean passed = score >=60;

        System.out.println(passed);
        System.out.println("------------------------------------");
        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);


        boolean elegibleToVote = age >=18;

        System.out.println(elegibleToVote);

        System.out.println("--------------------------------");
        System.out.println(100>100);//false
        System.out.println(100>=100);//true
        System.out.println(100>=185);//false
        System.out.println(100>=85);//true

        System.out.println("--------------------------------");
                score = 48;
                    boolean failed = score <60;
        System.out.println(failed);
        System.out.println("--------------------------------");

        System.out.println(100 <2000);
        System.out.println(100 <20);

        System.out.println("--------------------------------");


        System.out.println( 95 <=100);  //true

        System.out.println(100 <=100);

        System.out.println(10 <= 5);//false
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        //System.out.println("Java" <="C#");// only numbers can comparable
        System.out.println( 'a'>'b');// 65 >66

        System.out.println("--------------------------------");











    }
}