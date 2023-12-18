package ExceptionHandling.Demo4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception Hierarchy - https://i0.wp.com/www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png
 */
public class Client {
    public static void main(String[] args) {
        // Multiple catch blocks
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a/b;
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception Handled");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
        } finally {
            System.out.println("Finally executed");
        }

    }
}
