package Creational.Factory.PracticalFactory.v1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Now whenever there is such a case where the inheritance needs to be used across different places in the code base,
        // We do the following steps:
        // 1. Create a class called XFactory  -> Here UserFactory
        // 2. Create a method which takes input as it's parameter and return type as the parent object -> Here User
        //3. Pass the input from client to the factory method
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        User u1 = UserFactory.getUserForInput(input);
        User u2 = UserFactory.getUserFronEnum(UserType.STUDENT);

    }
}
