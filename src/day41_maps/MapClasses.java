package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //Map<String, Integer> map=new Map<>;// map is a interface, so never being create object
        Map<String, Integer> hashMap=new HashMap<>();//random order; accepts null as a key and value
        hashMap.put("Ali",95000);// must give string first, and integer second as referenced// key can not be duplicated
        hashMap.put("Bella",100000);
        hashMap.put("Emily",85000);
        //map1.put("Ali",200000);
        hashMap.put("Chirs",null);
        hashMap.put("Berna",null);
        hashMap.put(null,20000);
        hashMap.put(null,200000);
        hashMap.put(null, 50000);
        System.out.println("hashMap = " + hashMap);

        System.out.println("===================================");



        Map<String, Integer> treeMap=new TreeMap<>();//sorted order(ascending order)// dose not accepted null, but accepts but value// sorted by the key
        treeMap.put("Ali",95000);// must give string first, and integer second as referenced// key can not be duplicated
        treeMap.put("Bella",100000);
        treeMap.put("Emily",85000);
        //map1.put("Ali",200000);
        treeMap.put("Chirs",null);
        treeMap.put("Berna",null);
        //treeMap.put(null,20000);
       // treeMap.put(null,200000);
        //treeMap.put(null, 50000);
        System.out.println("treeMap = " + treeMap);
        System.out.println("===========================");

        Map<String, Integer> linkedHashMap=new LinkedHashMap<>();//insertion order// accepts null key and value
        linkedHashMap.put("Ali",95000);// must give string first, and integer second as referenced// key can not be duplicated
        linkedHashMap.put("Bella",100000);
        linkedHashMap.put("Emily",85000);
        linkedHashMap.put("Chirs",null);
        linkedHashMap.put("Berna",null);
        linkedHashMap.put(null,20000);
        linkedHashMap.put(null,200000);
        linkedHashMap.put(null, 50000);
        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("=================================");

        Map<String, Integer> hashTable=new Hashtable<>();//random order// dose not accepts null key or value// synchronized(thread safety)
        hashTable.put("Ali",95000);// must give string first, and integer second as referenced// key can not be duplicated
        hashTable.put("Bella",100000);
        hashTable.put("Emily",85000);
       // hashTable.put("Chirs",null);
        //hashTable.put("Berna",null);
        //hashTable.put(null,20000);
        //hashTable.put(null,200000);
        //hashTable.put(null, 50000);
        System.out.println("hashTable = " + hashTable);




    }
}
