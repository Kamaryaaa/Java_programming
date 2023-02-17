package utilities;

import day27_accessModifier.AccessModifier;
import day27_accessModifier.Data;

public class Test2 {
    public static void main(String[] args) {


        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("================");


        System.out.println(AccessModifier.publicData);
        //System.out.println(AccessModifier.protectedData);
        //System.out.println(AccessModifier.defaultDate);
        //System.out.println(AccessModifier.privateData);

        new AccessModifier();




    }
}
