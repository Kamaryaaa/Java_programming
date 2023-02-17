package day37_exceptions.pizzaTask;

import day36_polimorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza('S',2,3);
        Pizza pizza2=new Pizza('S',2,3);

        System.out.println(pizza1==pizza2);//false:compare location in the heap

        //System.out.println(pizza1.equals("Pizza"));//invalid obj

        //System.out.println(pizza1.equals(100));//false
        System.out.println(pizza1.equals(pizza2));//true

        Object obj=new Pizza('S',4,5);// UPCASTING

        boolean r = obj.equals(pizza2);

        System.out.println("r = " + r);

        double total = ((Pizza) obj).calcCost();

        System.out.println("total = " + total);

        double area = ((Circle)obj).area();
        System.out.println("area = " + area);





    }
}
