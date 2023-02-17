package Day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public  String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hire_date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hire_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hire_date = hire_date;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hire_date=" + hire_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }
}


/*
name
age
gender
jobTitle
salary
hired date
 */
