package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

        Person[] people = {new Person(),new Person(),new Person()
        ,new Person(),new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Xami",'F', LocalDate.of(1999,5,2));
        people[2].setInfo("Eila",'F', LocalDate.of(2000,8,13));
        people[3].setInfo("Hubs",'M', LocalDate.of(2005,11,9));
        people[4].setInfo("Ali",'M', LocalDate.of(1973,4,7));


        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));
        for (Person person : studentList) {

            System.out.println(person.name+" : "+ person.dateOfBirth);
        }
        System.out.println("========removeIf();==============");
         studentList.removeIf(p -> p.age>35);

        for (Person person : studentList) {

            System.out.println(person.name+" : "+ person.dateOfBirth);
        }









    }
}
