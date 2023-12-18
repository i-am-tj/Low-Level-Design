package ExceptionHandling.Demo6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        // Checked vs Unchecked exception (compile time vs run time)
        // Checked exception directly extends Exception and should be handled
        // While unchecked exception extends RunTime Exception and can be optional
        // Checked Exception - IOException, SQLException
        // Unchecked Exception - ArrayIndexOutOfBoundException, ArithmeticException

        //Example - FileReader and Scanner
        File file = new File("abc.txt"); // Checked Exception - Java forces to use throws FileNotFoundException
        FileReader fr = new FileReader(file);
        fr.read(); // Checked Exception - Java forces to use throws IOException directly


        Scanner sc = new Scanner(System.in); //Unchecked Exception - Java doesn't enforce to use try catch
        try {
            int n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception Handled");
        }


    }
}
