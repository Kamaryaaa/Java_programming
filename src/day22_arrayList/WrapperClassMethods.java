package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="20";


        System.out.println(str+1);// print 201 when str is treated as text

       // Integer num1=Integer.parseInt(str);

        int num = Integer.parseInt(str);
        System.out.println(num+1);// print 21 when we're converting str to int

        Integer num2 = Integer.valueOf(str);
        System.out.println("num2 = " + num2);

        System.out.println("==============ConvertingToDouble===================");
        String s = "20.5";

        double num3=Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("==============ConvertingToCharacter==================");

        String x = "false";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("=======WrapperClassMethodsCharacter=======");

        char ch ='1';
        boolean isDigit = Character.isDigit(ch);

        System.out.println("isDigit = " + isDigit);

        char cha='%';
        boolean isLetter = Character.isLetter(cha);

        boolean isLowerCaseLetter = Character.isLowerCase(cha);
        boolean isUpperCaseLetter = Character.isUpperCase(cha);
        boolean isSpecialCharacter = !Character.isLetterOrDigit(cha);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);

        System.out.println("=======WrapperClassMethodsCharacter=======");
        String string ="a1b2c3d4e5";

        int sum=0;

        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
               sum+= Integer.parseInt(""+each);
            }

        }
        System.out.println("sum = " + sum);



    }
}
