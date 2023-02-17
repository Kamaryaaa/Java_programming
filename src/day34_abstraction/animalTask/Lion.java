package day34_abstraction.animalTask;

import java.lang.reflect.WildcardType;

public class Lion extends  Animal implements wildAnimal {

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating lion food");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }
}
