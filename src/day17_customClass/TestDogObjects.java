package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='M';
        dog1.age=4;
        dog1.size="Large";
        dog1.color="Grey";

        dog1.eat();
        System.out.println(dog1);

        Dog dog2=new Dog();
        dog2.name="Bella";
        dog2.breed="Golden Retriever";
        dog2.gender='F';
        dog2.age=2;
        dog2.size="Small";
        dog2.color="Orange";
        System.out.println(dog2);

        Dog dog3=new Dog();
        dog3.setInfo("Loki","Chow chow",'M',2,"medium","White");

        System.out.println(dog3);

        Dog dog4=new Dog();
        dog4.setInfo("Chuck","Bulldog",'M',1,"small","Orange");

        System.out.println(dog4);




    }
}
