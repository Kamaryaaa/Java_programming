package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1=new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,200,300,40,90));// orderis random
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        //queue1.addAll(Arrays.asList(null,null,null));// null is not accepted
        System.out.println("queue1 = " + queue1);
        int num1 = queue1.poll();

        System.out.println("queue1 = " + queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println("queue1 = " + queue1);


        System.out.println("===============================");

        Queue<Integer> queue2=new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10,200,300,40,90));// order is reserved
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));


        System.out.println("queue2 = " + queue2);

        queue2.poll();

        System.out.println("queue2 = " + queue2);

        for (int i = 0; i < 19; i++) {
            queue2.poll();

        }
        System.out.println("queue2 = " + queue2);


        System.out.println("===============================");

        Queue<Integer> queue3=new LinkedList<>();
        queue3.addAll(Arrays.asList(10,200,300,40,90));// order is reserved, accepts null, has index
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null));

        System.out.println("queue3 = " + queue3);
        queue3.poll();
        System.out.println("queue3 = " + queue3);

        System.out.println(((LinkedList<Integer>) queue3).get(4));


        System.out.println("===========================");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("list = " + list);

        ((LinkedList<Integer>) list).poll();//first in first out
        System.out.println("list = " + list);

        //((Stack)list).pop();// last in first out




    }
}
