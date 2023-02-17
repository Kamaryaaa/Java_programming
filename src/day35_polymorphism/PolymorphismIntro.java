package day35_polymorphism;

import day34_abstraction.animalTask.*;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {



    Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

    Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");


    Tiger tiger=null;
    Lion lion=null;
    Eagle eagle=null;
    Parrot parrot=null;
    Dolphin dolphin=null;
    Duck duck=null;


       Animal[] animals={dog,cat,tiger,lion,duck,parrot,eagle,dolphin};
       //can use the same reference type for the different type of obj

        System.out.println(Arrays.toString(animals));
    }

}
