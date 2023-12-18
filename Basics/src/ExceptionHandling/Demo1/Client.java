package ExceptionHandling.Demo1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //1. FileNotFound Exception
        File file = new File("abc.txt");
        FileReader fr = new FileReader(file);
        fr.read();

        //2. InputMismatchException
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //If the input is a string
        System.out.println(n);
    }
}
