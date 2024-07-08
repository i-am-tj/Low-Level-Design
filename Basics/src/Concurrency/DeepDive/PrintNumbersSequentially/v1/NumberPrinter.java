package Concurrency.DeepDive.PrintNumbersSequentially.v1;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            String threadName = Thread.currentThread().getName();
            if(threadName.equalsIgnoreCase("T1") && i % 3 == 1) {
                System.out.println("Number : " + i + " Thread: " + threadName);
            }
            if(threadName.equalsIgnoreCase("T2") && i % 3 == 2) {
                System.out.println("Number : " + i + " Thread: " + threadName);
            }
            if(threadName.equalsIgnoreCase("T3") && i % 3 == 0) {
                System.out.println("Number : " + i + " Thread: " + threadName);
            }
        }
    }
}
