package Day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {


    public static void main(String[] args) {


        Employee employee1 = new Employee
                ("Sami",34,'M',"SDET",105000,
                        LocalDate.of(2022,12,2));

        Employee employee2 = new Employee
                ("Ali",45,'M',"Java Developer",120000,
                        LocalDate.of(2021,1,2));
        System.out.println("employee2 = " + employee2);

        System.out.println("employee1 = " + employee1);



    }



}
