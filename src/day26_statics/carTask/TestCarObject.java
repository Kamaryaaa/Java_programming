package day26_statics.carTask;

import java.sql.SQLOutput;

public class TestCarObject {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println("car1 = " + car1);

        Car car2 = new Car("Audi","Q4");
        System.out.println("car2 = " + car2);

        Car car3 = new Car("Toyota","Camry",2021);
        System.out.println("car3 = " + car3);

        Car car4 = new Car("Honda","Accord",2020,30000);
        System.out.println("car4 = " + car4);

        Car car5 = new Car("Lexus","RX350",2019,40000,"Black");
        System.out.println("car5 = " + car5);







    }





}
