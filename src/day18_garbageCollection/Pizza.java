package day18_garbageCollection;

public class Pizza {


    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;




// calculate the total price of pizza and returns it as double
    public double calcCost(){

        double totalPrice=0;

        switch (size){
            case 'S':
            case 's':
                totalPrice=10+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice=12+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice=14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            default:
                System.err.println("invalid size: "+size);

        }
        return  totalPrice;
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size=size;
        this.numberOfCheeseTopping=numberOfCheeseTopping;
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }



    public String toString() {

        return "Pizza{" +"total prise= "+calcCost()+
                ", size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }


}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size,
				quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */
