package Concurrency.Intro;

public class Client {
    public static void main(String[] args) {
//        // Print from thread
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Main thread: " + i);
//        }
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread thread = new Thread(helloWorldPrinter);
//        thread.start();
//        for(int i = 50; i < 60; i++) {
//            System.out.println("Main thread: " + i);
//        }


        // Print till 100 from different threads
        for (int i = 0; i <= 100; i++) {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

    }
}
