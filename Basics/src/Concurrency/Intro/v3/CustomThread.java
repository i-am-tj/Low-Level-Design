package Concurrency.Intro.v3;

public class CustomThread implements Runnable {
    private final int sleepTimeInSecs;
    public CustomThread(int sleepTimeInSecs) {
        this.sleepTimeInSecs = sleepTimeInSecs;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("Custom Thread: " + i + " Thread Name: " + Thread.currentThread().getName());
                Thread.sleep(sleepTimeInSecs * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
