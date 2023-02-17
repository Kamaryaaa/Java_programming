package day29_inheritance.encapsulation;

public class Student {

    private String name,schoolName;
    private int age;
    private char gender,grade;

    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String getName(){ // read only
       /* if(name==null){
            return "Unknown";
        }

        */
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid= grade =='A'|| grade =='B'||grade=='C'||grade=='D'||grade=='F';
        if(isValid){
            this.grade = grade;
        }else {
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        /*if(!(gender=='M'|| gender=='F')){
            System.err.println("Invalid Gender: "+gender);
        }

         */
        if(gender=='M'|| gender=='F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender");
            System.exit(1);
        }

    }

    public void setName(String name){ //write only
        /*
        if(name.isEmpty()){

            System.err.println("Invalid Student name");
        }
        */
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can not be negative: "+age);
            System.exit(1);
        }
        if(age<0 || age>90){
            System.err.println("Invalid Student Age: "+age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", grade=" + getGrade() +
                '}';
    }
}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName
            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than:
                        'M' and 'F'
                        3. grade should not be set to any chanacters other than:
                        'A', 'B', 'C', 'D', and 'F'
            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)
            Methods:
                study()
                toString()
 */
