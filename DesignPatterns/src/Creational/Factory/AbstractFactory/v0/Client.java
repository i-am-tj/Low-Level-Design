package Creational.Factory.AbstractFactory.v0;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Database db = null;
        Query q;
        // We create Database based on user input and then provide that implementation to database factory to create a query of corresponding object
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("mysql")) {
            db = new MySQLDatabase();
        } else if (input.equalsIgnoreCase("postgre")) {
            db = new PostgreSQLDatabase();
        }
        // Here for each DB type we can create a class of corresponding Query
        if(db instanceof MySQLDatabase) {
            q = new MySQLQuery();
        } else if (db instanceof PostgreSQLDatabase) {
            q = new PostgreSQLQuery();
        }

        // But now this actually violates OCP and SRP for client class.
        // Also there could be a lot of implementations of Database which can be put in a separate class.
        // Hence we move to the new approach

    }
}
