package Concurrency.Intro.v6;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Problem.md - Q5
        // Create 3 Custom Threads with (min, norm, max) priority
        Thread thread1 = new Thread(new CustomThread(), "Number Printer Thread 1 with Minimum Priority");
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(new CustomThread(), "Number Printer Thread 2 with Normal Priority");
        thread2.setPriority(Thread.NORM_PRIORITY);
        Thread thread3 = new Thread(new CustomThread(), "Number Printer Thread 3 with Maximum Priority");
        thread3.setPriority(Thread.MAX_PRIORITY);
        // Start Them
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
