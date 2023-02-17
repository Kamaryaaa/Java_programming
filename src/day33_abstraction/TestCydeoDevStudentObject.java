package day33_abstraction;

import day33_abstraction.CydeoDevStudent;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {
    public static void main(String[] args) {


        CydeoDevStudent cydeoDevStudent=new CydeoDevStudent("Daniel", 'M',
                LocalDate.of(1989,11,1), "A1",
                "zero to hero", 2);
        System.out.println(cydeoDevStudent);

        cydeoDevStudent.eat();
        cydeoDevStudent.drink();
        cydeoDevStudent.breath();
        cydeoDevStudent.sleep();





    }
}
