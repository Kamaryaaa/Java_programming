package day19_array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char [] ascending = new char[26];
        char [] descending = new char[26];

        for (char i = 0, j ='A', k='Z'; i < ascending.length; i++,j++,k--) {

            ascending[i] = (char)j;// A~Z
            descending[i] = (char)k;//Z~A
        }
        System.out.println("ascending alphabet: "+Arrays.toString(ascending));
        System.out.println("ascending alphabet: "+Arrays.toString(descending));



        System.out.println("===================================");


    char [] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i]=(char)i;
        }
        System.out.println(Arrays.toString(characters));











    }
}
