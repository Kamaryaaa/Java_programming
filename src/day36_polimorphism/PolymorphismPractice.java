package day36_polimorphism;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;
import day32_finalKeyword.CarTask_Overridding.Toyota;

public class PolymorphismPractice {

    public static void main(String[] args) {


        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Black", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Black", 350),
                new Nokia("G10", "Medium", "White", 99),
                new Nokia("G50", "Large", "Black", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Pink", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };

        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - $"+each.getPrice());

        }
        int countIphone=0,
                countSamsung=0;
        for (Phone eachPhone : phones) {
            if(eachPhone instanceof IPhone){
                countIphone++;
            }
            if (eachPhone instanceof Samsung){
                countSamsung++;
            }
        }

        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        for (Phone eachPhone : phones) {
            if(eachPhone instanceof IPhone || eachPhone instanceof Samsung){
                if(eachPhone.getPrice()>=700){
                    System.out.println(eachPhone.getModel());
                }
            }

        }







    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many Iphones in the array of phones?
	3. How many Samsungs in the array of phones?
	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */

