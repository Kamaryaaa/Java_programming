package day08_Ternaries_switch;

public class SwitchStatementIntro3 {
    public static void main(String[] args) {
        //cant use switch statement
        int score=95;

        String result="";
        if(score>=90){
            result +="A";
        }else if(score>=80 &&score<90){
            result+="B";
        } else if (score>=70&& score<80) {
            result+="C";
        } else if (score>=60 &&score<70) {
            result +="D";
        }else{
            result+="F";
        }

        System.out.println("Your grade is "+result);

        //===========================================

        int number = 14;

        String month="";
        switch(number){
            case 1: month="January";break;
            case 2: month="Feburary"; break;
            case 3: month="March";break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July";break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;

        }
        System.out.println(month);









    }
}
