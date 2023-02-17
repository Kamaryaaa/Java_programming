package day26_statics.phoneTask;

public class TestIPhoneObject {


    public static void main(String[] args) {


        IPhone iphone=new IPhone("iPhone12","Black",1000);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);


        iphone.printPhoneInfo();

        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperatingSystem();





    }





}
