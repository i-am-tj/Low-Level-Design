package Concurrency.Intro.v5;

public class Client {
    public static void main(String[] args) {
        // Problem.md - Q4
        // Since we are already implementing runnable in earlier explanations for this
        // I would create a runnable class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Hello from Runnable: " + i);
                }
            }
        };
        Thread thread = new Thread(runnable, "Runnable Thread");
        thread.start();
    }
}
