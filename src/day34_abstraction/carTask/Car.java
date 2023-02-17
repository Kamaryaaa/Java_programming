package day34_abstraction.carTask;

public abstract class Car {

     private final String make,model;// need to initialize the final variables in order to not have compiled error

    private String color;
    private final int year;
    private double price;

    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();// to set the class name to the make of the car
        this.model = model;
        this.color = color;
        if(year< 1886){
            System.err.println("Invalid year: "+year);
        }
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){// to make sure than non sub-class outside the package can not access it
        System.out.println("Press the brake to stop the car "+make+" "+model);
    }

    public abstract void start();// meant to be overridden

    public String toString() {
        return make+" {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
/*
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price
			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero
			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car
			Methods:
				stop() (final): prints "Press the brake"
				start() (abstract)
				toString(): prints the given car info when a car object is
				passed in the print statement
 */