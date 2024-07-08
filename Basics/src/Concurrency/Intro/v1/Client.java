package Concurrency.Intro.v1;

public class Client {
    public static void main(String[] args) {
        // In this example we will first see how we can print in different ways

        // 1. Print from Main thread class
        for(int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i);
        }

        // 2. Prints Hello World using a Thread and also does Main Thread execution in between
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
        for(int i = 50; i < 60; i++) {
            System.out.println("Main thread: " + i);
        }

        // 3. Print till 100 from different threads
        for (int i = 0; i <= 100; i++) {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

        //Next we will proceed with the problems

    }
}
