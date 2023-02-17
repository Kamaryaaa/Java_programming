package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] names = new String[12];

        names[0]="Gulcin";
        names[1]="Abdulla";
        names[2]="Sumeyya";
        names[3]="Karim";
        names[4]="Kiara";
        names[5]="Arzu";
        names[6]="Aziza";
        names[7]="Aliya";
        names[8]="Elec";
        names[9]="Erix";
        names[10]="Dilraba";
        names[11]="Destiny";
        names[names.length-1]="Asil";

        System.out.println(Arrays.toString(names));
        names[1]="Kuzzat";
        System.out.println(Arrays.toString(names));
        System.out.println("=======================");
        for (int i = names.length-1; i >=0 ; i--) {
            System.out.println(names[i]);
        }

        System.out.println("=======================================");

        for (int i = 0; i < names.length; i++) {//  names.fori

        }

        for (int i = names.length - 1; i >= 0; i--) {// names.forr

        }









    }
}
