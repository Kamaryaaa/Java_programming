package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
        map.put("CO2","Josh");
        map.put("D02","Emily");
        map.put("02","Emily");
        map.put("v02","Lia");
        map.put("n02","Lissa");
        map.put("r02","Ait");
        map.put("e02","tiana");

        Map<String,String> employees=new LinkedHashMap<>();
        employees.putAll(map);

        System.out.println("employees = " + employees);
        System.out.println("map = " + map);

        System.out.println(map.equals(employees));//true
        System.out.println(map==employees);//false
    }
}
