package day17_customClass;

public class TestEmployeeObjects {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye",28,'F',"SDET",100000,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar",29,'M',"SDET",99000,"A120");

        Employee employee3 = new Employee();
        employee3.setInfo("Abdulla",30,'M',"Software Developer",120000,"A2");

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);







    }





}
