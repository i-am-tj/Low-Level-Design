package Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(10);

        for(int i = 0; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            es.submit(numberPrinter);
        }
        es.shutdown();
    }
}
