package day27_accessModifier;

public class AccessModifier {


    public static int publicData=200;
    protected static int protedtedData = 300;

     static int defaultData=400;// Access modifier: default

    private static int privateData=500;


    public AccessModifier(){

    }





    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protedtedData);
        System.out.println(defaultData);
        System.out.println(privateData);

        new AccessModifier();





    }





}
