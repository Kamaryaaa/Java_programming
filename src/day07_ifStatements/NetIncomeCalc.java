package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 75000;
        double taxRate=0;

        boolean isMarried=true;

        if(salary>=130000){
            taxRate= 0.35;
        }
        if(salary>=100000 &&salary<=129000){// if the salary more than 100000,
            // and less or equal to 129000
            //the tax rate should be 35%
            taxRate=0.30;
        }
        if(salary>=80000 && salary<=99000){//    if the salary more than 80000,
                // and less or equal to 99000
                //the tax rate should be 25%
            taxRate=0.25;
        }
        if(salary<=79000){
            taxRate=0.20;
        }
        if(isMarried){
            taxRate=taxRate-0.05;
        }

        System.out.println(salary-(salary*taxRate));





    }
}



/*Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less ta

 */