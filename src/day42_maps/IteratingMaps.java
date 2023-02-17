package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {


        Map<String, Integer> hashMap=new LinkedHashMap<>();//random order; accepts null as a key and value
        hashMap.put("Ali",95000);// must give string first, and integer second as referenced// key can not be duplicated
        hashMap.put("Bella",100000);
        hashMap.put("Emily",85000);


        System.out.println("===========iteratingTheMapByTheKeys==============");

        for (String each : hashMap.keySet()) {
            System.out.println("each = " + each);
        }
        for (String each : hashMap.keySet()) {
            hashMap.replace(each, hashMap.get(each));
        }
        System.out.println("hashMap = " + hashMap);
        System.out.println("===========iteratingTheMapByTheValues==============");


        for (Integer eachValue : hashMap.values()) {
            System.out.println("eachValue = " + eachValue);
        }
        System.out.println("===========iteratingTheMapByThePairs==============");

        for (Map.Entry<String, Integer> eachPairs : hashMap.entrySet()) {
            System.out.println("eachPairs -> " + eachPairs);

        }

        System.out.println("==============================");
        for (Map.Entry<String, Integer> eachEntry : hashMap.entrySet()) {
            String eachKey=eachEntry.getKey();
            Integer eachValue=eachEntry.getValue();
            eachEntry.setValue(eachValue+10000);
            System.out.println(eachKey+" : "+eachValue);

        }
        System.out.println(hashMap);
    }
}
