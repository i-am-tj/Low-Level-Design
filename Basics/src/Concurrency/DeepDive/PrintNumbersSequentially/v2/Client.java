package Concurrency.DeepDive.PrintNumbersSequentially.v2;

public class Client {
    public static void main(String[] args) {
        // In the last example we have seen each thread were printing perfectly but the order was not correct
        // For this we'll use 2 concepts here - 1. Synchronized 2. Locks
        // 1. A synchronized keyword is used to encapsulate a block or a method where only one thread can enter
        // 2. Locks are elements which stops the entry of other elements in a block or method
        // Synchronized is used with locks in order to lock the object for other threads
        // We can define a method as synchronized as well which puts a lock on this object

        // 1. Create 3 threads
        Thread t1 = new Thread(new NumberPrinter(), "T1");
        Thread t2 = new Thread(new NumberPrinter(), "T2");
        Thread t3 = new Thread(new NumberPrinter(), "T3");

        // 2. Start all of them
        t1.start();
        t2.start();
        t3.start();

    }
}
