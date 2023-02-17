package day32_finalKeyword;

import java.time.LocalDate;

public class FinalKeyword {






    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

        //gender='F';

        //System.out.println(gender);//F

        System.out.println("===============");
       final LocalDate dob=LocalDate.now();
        System.out.println(dob);

        //dob=dob.minusDays(2);
        //System.out.println(dob);







    }




}
