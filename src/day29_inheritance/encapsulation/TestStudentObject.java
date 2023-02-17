package day29_inheritance.encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {


        Student student1=new Student("Hamza","MIT",34,'M','A');
        System.out.println(student1);
        student1.setSchoolName("Harward");
        student1.setGrade('B');
        System.out.println(student1);


    }
}
