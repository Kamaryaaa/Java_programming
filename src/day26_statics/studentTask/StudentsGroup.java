package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String name;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String name, int groupId) {
        this.name = name;
        this.groupId = groupId;
        //students = new ArrayList<>();// size=0;
    }// create the Student group object by setting the group name and group id

    public void addStudent(Student student){

        students.add(student);
    }// takes onr student object, and adds it to the arraylist of students

    public void addStudent(String name, int age, char gender, String id){
        //Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
        // takes name, age, gender,id, and adds to array list of students
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));

    }

    public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));
        // takes an id and then remove the matching students from the array list of students
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "name='" + name + '\'' +
                ", groupId=" + groupId +
                ", Total number of students=" + students.size() +
                '}';
    }
}
/*
Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students
	                arrayList

	                removeStudent(id): removes the student with the specified
	                id from the students arraylist

	                toString(): displays the groupName, groupId and total number
	                of students when a group object is passed in the print statement
 */