package Creational.Factory.PracticalFactory.v0;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        User u;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("mentor")) {
            // Create mentor

        } else if (input.equalsIgnoreCase("ta")) {
            // Create TA

        } else if (input.equalsIgnoreCase("student")) {
            //Create Student

        } else {

        }



        // Note: Think of practical design pattern whenever there is an inheritance relation
    }
}
