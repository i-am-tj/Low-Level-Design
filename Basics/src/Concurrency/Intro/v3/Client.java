package Concurrency.Intro.v3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Problem.md - Q2
        // Create Custom Thread
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter custom sleep time for thread: ");
        int n = sc.nextInt();
        Thread thread = new Thread(new CustomThread(n), "Number Printer Thread with Sleep Time of " + n + " seconds");
        thread.start();
    }
}
