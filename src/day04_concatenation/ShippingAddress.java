package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Kamarya Abulmit",
                streetName = "Kashgar Road",
                city = "Urumqi",
                state = "Tangritah",
                zipCode = "800001";

        int buildingNumber = 85;
        System.out.println("Your shipping address is: ");
        System.out.println("\t"+name);
        System.out.println("\t"+ buildingNumber+" "+streetName);
        System.out.println("\t"+city+", "+state+" "+zipCode);
        System.out.println("-------------------------------");
        System.out.println("Your shipping  address is: "+"\n\t"+name+"\n\t"+buildingNumber+" " +
                streetName+"\n\t"+ city+", "+state+" "+zipCode);





    }
}
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
	Ex:
	      Your Shipping address is:
                Aaron Kissinger
                13621A Legacy Circle
                Fairfax, VA 22030
*/