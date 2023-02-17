package Day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
   public LocalDate dateOfBirth;
   boolean isMarried, isEmployed;

    public Person(String name, int age, char gender,
                  LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("y/MMM/dd")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }



    public void eat(String food){
        System.out.println(name+" is eating "+food);

    }

    public void drink(String drinkType){
        System.out.println
                (name+" is drinking "+drinkType);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    



}
/*
name,age,gender, dateOfBirth,isMarried,isEmployed

toString(), eat(String food), sleeping(), drink(String drink)
 */
