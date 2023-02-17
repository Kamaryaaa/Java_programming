package day08_Ternaries_switch;

public class SwitchStatementIntro {
    public static void main(String[] args) {

        int n = 7;

        String day = "";


                       //Data type must match // order can be switched. we can use 6 after1

        switch (n){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                    day="Thursday";
                    break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Invalid day";

        }
        System.out.println(day);





    }
}
