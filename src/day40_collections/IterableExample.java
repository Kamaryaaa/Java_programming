package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,6,7,8));

        Iterator<Integer> it= list.iterator();
        while(it.hasNext())
        {
            Integer each = it.next();
            if(each<5){
                it.remove();
            }
        }
        System.out.println("list = " + list);
        /*
        for (Integer each : list) {
            if(each>5){
                list.remove(each);
            }
        }


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);
*/// remove method can not remove the element from the collection due to which size is dynamic


        System.out.println("===============================");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,6,7,8));

        for(Iterator<Integer> i =list3.iterator();i.hasNext();){
            Integer each = i.next();
            if(each<5){
                i.remove();
            }

            
        }
        System.out.println("list3 = " + list3);
        System.out.println("===============================");


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,6,7,8));

        list4.removeIf(each -> each<5);

        System.out.println("list4 = " + list4);



    }
}
