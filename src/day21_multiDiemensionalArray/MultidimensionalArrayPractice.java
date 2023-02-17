package day21_multiDiemensionalArray;

import java.util.Arrays;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;


      String[][] groups = {group1,group2,group3,group4};

        for (String[] eachIDArray : groups) {
            System.out.println(Arrays.toString(eachIDArray));
            for (String eachMember : eachIDArray) {
                System.out.println(eachMember);

            }
        }

        System.out.println("=======MixingForLoopAndForEachLoop=======");

        for (int i = groups.length-1; i >=0 ; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

        }
        System.out.println("=======PrintingTwoDimensionalArray=======");

        System.out.println(groups);// toString(): ==> for printing single dimensional arrays ONLY

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups));//deepToString(): ==> for printing multi dimensional arrays



    }
}
