package day34_abstraction.carTask;

import day34_abstraction.animalTask.Flyable;

public class Airplane implements Flyable {


    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
