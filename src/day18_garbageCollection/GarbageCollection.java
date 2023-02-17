package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";

        s1=null;//"Java" will be eligible for garbage collection
        System.out.println(s1);

        //System.out.println(s1.replace(null,"Python"));

        System.out.println("--------------------------------------");

          String str1 = "Python";
          str1="CYDEO";
        System.out.println(str1);

        System.out.println("------------------------------------");

        Dog dog1=new Dog();
        dog1.setInfo("Loki","Chow chow",'M',2,"Large","White");

        System.out.println(dog1);

        Dog dog2=new Dog();
        dog2.setInfo("Chuck","Bulldog",'M',1,"Small","Orange");

    //dog1=null;
        dog1=dog2;
        System.out.println(dog1);
        System.out.println(dog2);

    }
}
