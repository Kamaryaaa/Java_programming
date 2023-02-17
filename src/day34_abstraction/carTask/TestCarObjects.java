package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {


        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        honda.stop();
        audi.stop();
        tesla.stop();

        honda.start();
        audi.start();
        tesla.start();

        audi.autoPar();







    }
}
