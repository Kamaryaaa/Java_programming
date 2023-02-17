package day17_customClass;

public class UniqueCharacter1 {
    public static void main(String[] args) {


        String str = "aabcccd";

        String unique="";

        for (int i = 0; i <str.length() ; i++) {// i : index numbers of str--- 0,1,2,3,4,5,6
            char each = str.charAt(i); // 'a'  'a'  'b'  'c'  'c'  'c'  'd'

            if(str.indexOf(each)==str.lastIndexOf(each)) {
                unique+=each;
            }

        }
        System.out.println(unique);






    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */