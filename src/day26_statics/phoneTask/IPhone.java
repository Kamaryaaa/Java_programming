package day26_statics.phoneTask;

public class IPhone {

    public static String brand = "Apple", madeIn="China", OS="iOS";
    // all the iPhone object's brand, madein and OS have the same value for every iphone obj;

    public String model,color;// instances: different models for iPhone objects;

    public double price;

    public static boolean hasBattery=true, isTouchScreen=true,isExpensiveToFix=true;


    /*
    public static void printPhoneInfo(){// static only eccept static
        System.out.println("Model" +model);
        System.out.println("Color "+ color);
    }

     */

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);

    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: "+OS);
    }















}
/*
Attributes: brand, model, color, prise, OS, madeIn;
 */
