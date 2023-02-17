package day34_abstraction.carTask;

public class Audi extends Car {
    public Audi( String model, String color, int year, double price) {
        super( model, color, year, price);
    }



    public void start(){
        System.out.println("Presa the start button "+getMake()+getModel());
    }

    public void autoPar(){
        System.out.println(getMake()+" "+getModel()+" is auto parking");
    }
}
