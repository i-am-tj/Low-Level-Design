package Concurrency.DeepDive.PrintNumbersSequentially.v0;

public class Client {
    public static void main(String[] args) {
        // Problem.md - Q1
        // Let's first try to create 3 threads and try printing all the numbers from 1 to 30
        // Then gradually we will advance to each thread printing certain numbers and then sequentially

        // 1. Create 3 threads
        Thread t1 = new Thread(new NumberPrinter(), "T1");
        Thread t2 = new Thread(new NumberPrinter(), "T2");
        Thread t3 = new Thread(new NumberPrinter(), "T3");

        // 2. Start all of them
        t1.start();
        t2.start();
        t3.start();

        // Here we see the threads executing in random order and every thread is printing all the numbers
        // So in next version let's only print the numbers according to the thread name

    }
}
