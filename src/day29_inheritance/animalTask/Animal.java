package day29_inheritance.animalTask;

public class Animal {

    public String name, breed, size,color;
    public int age;
    public char gender;

    public static boolean isAnimal;

    static{
        isAnimal=true;
    }

    public void setInfo(String name, String breed,char gender,int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking water");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
