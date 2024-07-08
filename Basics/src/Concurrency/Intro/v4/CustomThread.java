package Concurrency.Intro.v4;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Custom Thread: " + i + " Thread Name: " + Thread.currentThread().getName());
        }
    }
}
