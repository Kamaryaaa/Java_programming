package day34_abstraction.animalTask;

public class Tiger extends Animal implements wildAnimal{



    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating tiger food");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }
}
