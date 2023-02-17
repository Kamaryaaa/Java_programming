package day40_collections;

import java.util.*;

public class CollectionsPractice {
    public static <list> void main(String[] args) {


        Collection<Integer> collection=new ArrayList<>();
        collection.addAll(Arrays.asList(100,200,300,400,500,600,700));

        System.out.println(collection);

        System.out.println(((ArrayList<Integer>) collection).get(2));// down-casting

        //System.out.println(((Stack)collection).pop());// no is a relations between stack and arraylist
        System.out.println("=================================");

        Collection<Integer> collection2=new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,300,400,500,600,600,100,300,400,100));
        System.out.println("collection2 = " + collection2);
        //System.out.println( ( (ArrayList)collection2).get(5));// no is a relationship

        System.out.println(new ArrayList<>(collection2).get(4));

        List<Integer> l = new ArrayList<>(collection2);



    }
}
