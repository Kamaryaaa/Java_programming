package day36_polimorphism;

import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class TestEqualsMethod {
    public static void main(String[] args) {


        Circle circle1=new Circle(15);

        Circle circle2=new Circle(5);

        Circle circle3=new Circle(5);


        System.out.println(circle1==circle2);//false

        System.out.println(circle1.equals(circle2));

        System.out.println(circle1.equals(circle3));

        System.out.println("===============================");

        IPhone iPhone1 = new IPhone("Apple","Iphone 12","Medium","Black",900);

        IPhone iPhone2 = new IPhone("Apple","Iphone 12","Medium","Black",900);

        System.out.println(iPhone1.equals(iPhone2));

        System.out.println("========================");

        Electric electric=new Tesla("Tesla","Model Y","Blue",2020,55000);

        electric.charge();
        ((Tesla) electric).autoPark();
        System.out.println(electric);

        System.out.println("========================");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

          employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();













    }
}
