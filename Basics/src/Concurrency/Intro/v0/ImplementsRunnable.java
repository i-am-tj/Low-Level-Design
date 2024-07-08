package Concurrency.Intro.v0;

public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("Implementing Runnable   : " + i + " Thread Name: " + Thread.currentThread().getName());
        }
    }
}
