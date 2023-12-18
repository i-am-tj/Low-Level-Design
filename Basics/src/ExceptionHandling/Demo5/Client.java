package ExceptionHandling.Demo5;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Nested Try Catch
        try {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            AEDemo.divideByZero(n);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
        }
    }
}
