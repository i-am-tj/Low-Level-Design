package ExceptionHandling.Demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Finally usage explanation
        Scanner sc = new Scanner(System.in);;
        try {
            int n = sc.nextInt(); //If the input is a string
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException Handled");
        } finally {
            // Even if a return statement is there in the try block then also the 'finally' block is executed but not the statements after finally block
            System.out.println("Exception Handled. Closing");
            sc.close();
        }
    }
}
