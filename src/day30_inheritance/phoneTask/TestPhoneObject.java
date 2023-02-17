package day30_inheritance.phoneTask;

public class TestPhoneObject {

    public static void main(String[] args) {

       IPhone iphone = new IPhone("Iphone 12","Large","Black",1000.5);

       Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);

       Nokia nokia=new Nokia("Brick","Small","Pink",50);

       iphone.call(911);
       samsung.call(911);
       nokia.call(911);

       iphone.text(1234567);
       samsung.text(1234567);
       nokia.text(1234567);

        System.out.println("==================================");
         iphone.faceTime(12345678);
         //iphone.freeze();
        //nokia.freeze();

        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }




}
