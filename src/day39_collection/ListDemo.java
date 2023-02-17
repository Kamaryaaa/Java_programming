package day39_collection;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arayList=new ArrayList<>();//Array based classs==> get() is faster
        //arayList.get(0);

        arayList.add(100);
        arayList.add(200);
        arayList.add(200);

        List<Integer> linkedList=new LinkedList<>();// Node based class(doubly linked list) ==>
                                                       // add() addAll() remove() removeAll()
       // linkedList.get(0);

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        System.out.println("==============================");


        Vector<Integer> vector=new Vector<>();


        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println("==============================");


        Stack <Integer> stack=new Stack<>();


        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);










    }
}
