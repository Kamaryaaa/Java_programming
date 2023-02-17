package day34_abstraction.animalTask;

public class Dolphin extends  Animal implements Playable,swimable {


    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating dolphin food");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is flying");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming");
    }
}
