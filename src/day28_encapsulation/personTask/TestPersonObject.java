package day28_encapsulation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Lia");

        Person  person2 = new Person("Abdullah",'M');

        Person person3 = new Person("Aliya",30);

        Person person4 = new Person("Tatiyana",25,'F');

        Person person5 = new Person("Lucy","English",'F','M');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Person.printPlanetName();

        person1.eat("Baklawa");

        person2.drink("Water");





    }
}
