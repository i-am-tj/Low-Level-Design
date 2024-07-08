package Concurrency.DeepDive.PrintNumbersSequentially.v0;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            System.out.println("Number : " + i + " Thread: " + Thread.currentThread().getName());
        }
    }
}
