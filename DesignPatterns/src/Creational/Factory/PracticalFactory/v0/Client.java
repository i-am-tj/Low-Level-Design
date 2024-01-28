package Creational.Factory.PracticalFactory.v0;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        User u;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("mentor")) {
            u = new Mentor();
        } else if (input.equalsIgnoreCase("ta")) {
            u = new TA();
        } else if (input.equalsIgnoreCase("student")) {
            u = new Student();
        } else {
            System.out.println("User not found");
        }

        //The above code violates SRP and OCP
        // Practical design pattern allows you to create an object of correct child class based on some condition
        // Now since the creation of user can be called from different places in the code and this client class doing this operation
        // doesn't make sense. Hence, we are moving on to the next approach.

        // Note: Think of practical design pattern whenever there is an inheritance relation.
    }
}
