package day19_array;

public class MinNumber {
    public static void main(String[] args) {


        int[] numbers = {100, 20, 500, -10, 30};

        int min = numbers[0];// assume that the first element is the minimum number
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min =numbers[i];
            }
        }
        System.out.println("min = " + min);





    }
}
