package day39_collection.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        ThreadHelloWorld thread=new ThreadHelloWorld(1);
        ThreadHelloWorld thread2=new ThreadHelloWorld(2);
        ThreadHelloWorld thread3=new ThreadHelloWorld(3);
        ThreadHelloWorld thread4=new ThreadHelloWorld(4);
        ThreadHelloWorld thread5=new ThreadHelloWorld(5);



        thread.start();
        thread2.start();
        thread4.start();
        thread5.start();
        thread3.start();






    }
}
