package Concurrency.Executors;

public class NumberPrinter implements Runnable {
    private int num;

    NumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " " + num);
    }
}
