package Concurrency.DeepDive.PrintNumbersSequentially.v1;

public class Client {
    public static void main(String[] args) {
        // Problem.md - Q1
        // In this example let's create the threads and only print the numbers which should have been printed by it

        // 1. Create 3 threads
        Thread t1 = new Thread(new NumberPrinter(), "T1");
        Thread t2 = new Thread(new NumberPrinter(), "T2");
        Thread t3 = new Thread(new NumberPrinter(), "T3");

        // 2. Start all of them
        t1.start();
        t2.start();
        t3.start();

        // Here we see the threads executing in random order but we can also see that
        // only the assigned thread gets to print the number
        // In the next version we will see how to make it sequential

    }
}
