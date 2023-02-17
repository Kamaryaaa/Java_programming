package day34_abstraction.animalTask;

public class Cow extends Animal {
    public Cow(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating cow food");
    }
}
