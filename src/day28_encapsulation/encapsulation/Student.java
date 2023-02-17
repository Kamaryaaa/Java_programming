package day28_encapsulation.encapsulation;

public class Student {

    private String name;

    public String getName() {

        if(name==null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }


    public void setName(String name) {
        boolean hasDigit=false, hasSpecialChar=false;
        for (char each : name.toCharArray()){
            if(Character.isDigit(each)){
                hasDigit=true;
                break;
            }
        }

        if(hasDigit){
            System.err.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    private int age;

    public int getAge(){
        if(age ==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){
        if(age<1 || age>100){ //if the age is invalid
            System.err.println("Invalid Age: "+age);
            //return; // existing the method
            System.exit(1);// program gets terminated
        }
        this.age=age;
    }
}
