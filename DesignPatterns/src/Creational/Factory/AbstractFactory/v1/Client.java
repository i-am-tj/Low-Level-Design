package Creational.Factory.AbstractFactory.v1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Abstract Factory Design Pattern is an extension of Factory Method
        // we extract out all the factory methods from an interface to
        // another interface.
        // Because we want to follow SRP
        // Hence we create a Factory ex - DatabaseFactory

        // We create Database based on user input and then provide that implementation to database factory to create a query of corresponding object
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Database db = null;
        if(input.equalsIgnoreCase("mysql")) {
            db = new MySQLDatabase();
        } else if (input.equalsIgnoreCase("postgre")) {
            db = new PostgreSQLDatabase();
        }

        Query q;
        DatabaseFactory databaseFactory = null;
        if(db instanceof PostgreSQLDatabase) {
            databaseFactory = new PostgreSQLDBFactory();
        } else if (db instanceof MySQLDatabase) {
            databaseFactory = new MySQLDBFactory();
        }
        q = databaseFactory.createQuery();
        // Now, this might look same as Practical Factory but in this the return type
        // of methods is of corresponding class
    }
}
