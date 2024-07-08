package Concurrency.Intro.v4;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Problem.md - Q3
        // Create 2 Custom Threads
        Thread thread1 = new Thread(new CustomThread(), "Number Printer Thread 1");
        Thread thread2 = new Thread(new CustomThread(), "Number Printer Thread 2");
        // Start Them
        thread1.start();
        thread2.start();
        // Wait for them to end
        thread1.join();
        thread2.join();
        System.out.println("Threads have finished execution");
    }
}
