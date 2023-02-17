package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {
        //isEmpty()
        String word = "";

        boolean r1 = word.isEmpty();
        System.out.println(r1);

        System.out.println("============================");//isBlank()

        String str = "              ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("==========================");
        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("==========================");

        String students = "Hasan Naran Sumeve Natalia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);

        System.out.println("=======================");

        String name = "Micheal";

        boolean l = name.startsWith("Da");
        System.out.println(l);


        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);


        boolean t = url.endsWith(".com");
        System.out.println(t);



        String email="CydeoSchool@gmail.com";

        boolean isGmail=email.endsWith("gmail.com");
        boolean isYahoo=email.endsWith(".yahoo");
        boolean isHotMail = email.endsWith(".hotmail");

        System.out.println(isYahoo);
        System.out.println("isHotMail = " + isHotMail);
        System.out.println("isGmail = " + isGmail);







    }
}
