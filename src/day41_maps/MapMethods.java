package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {


        System.out.println("============put()================");
        Map<String,String> map=new TreeMap<>();
        map.put("CO2","Josh");
        map.put("D02","Emily");
        map.put("02","Emily");
        map.put("v02","Lia");
        map.put("n02","Lissa");
        map.put("r02","Ait");
        map.put("e02","tiana");
        System.out.println("map = " + map);
        map.put("02","Tony");
        map.put("e02","tina");
        System.out.println("map = " + map);





        System.out.println("==============size()===============");
        System.out.println("map = " + map.size());




        System.out.println("=============get()===============");

        System.out.println(map.get("D02"));




        System.out.println("==============replace()===============");

        map.replace("n02","Osi");
        System.out.println("map = " + map);





        System.out.println("============remove()==================");

        map.remove("02");
        System.out.println("map = " + map);
        System.out.println("============containsKey();containsValue==================");

        System.out.println(map.containsKey("CO2"));//true
        System.out.println(map.containsKey("cvr"));//false
        System.out.println(map.containsValue("kasa"));//false
        System.out.println(map.containsValue("tina"));//true




        System.out.println("============isEmpty()==================");
        System.out.println(map.isEmpty());//false





        System.out.println("============clear()==================");

        map.clear();
        System.out.println("map = " + map);














    }
}
