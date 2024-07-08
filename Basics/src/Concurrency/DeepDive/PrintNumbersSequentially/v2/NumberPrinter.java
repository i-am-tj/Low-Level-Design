package Concurrency.DeepDive.PrintNumbersSequentially.v2;

public class NumberPrinter implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 30; i ++) {
            synchronized (this) {
                String threadName = Thread.currentThread().getName();
                if(threadName.equalsIgnoreCase("T1") && i % 3 == 1) {
                    System.out.println("Number : " + i + " Thread: " + threadName);
                    this.notifyAll();
                } else {
                    System.out.println("Thread Name: " + threadName + " i: " + i);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(threadName.equalsIgnoreCase("T2") && i % 3 == 2) {
                    System.out.println("Number : " + i + " Thread: " + threadName);
                    this.notifyAll();
                } else {
                    System.out.println("Thread Name: " + threadName + " i: " + i);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(threadName.equalsIgnoreCase("T3") && i % 3 == 0) {
                    System.out.println("Number : " + i + " Thread: " + threadName);
                    this.notifyAll();
                } else {
                    System.out.println("Thread Name: " + threadName + " i: " + i);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
