package Concurrency.Intro.v2;

public class Client {
    public static void main(String[] args) {
        // Problem.md - Q1
        // Create 2 threads
        Thread thread1 = new Thread(new CustomThread(), "First Thread");
        Thread thread2 = new Thread(new CustomThread(), "Second Thread");
        // Start Thread
        thread1.start();
        thread2.start();
    }
}
