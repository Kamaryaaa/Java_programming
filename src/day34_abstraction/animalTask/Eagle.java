package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, wildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating eagle food");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }
}
