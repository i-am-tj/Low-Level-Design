package ExceptionHandling.Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //1. FileNotFound Exception Handling
        try {
            File file = new File("abc.txt");
            FileReader fr = new FileReader(file);
            fr.read();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Handled");
        }

        //2. InputMismatchException Handled
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); //If the input is a string
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException Handled");
        }

    }
}
