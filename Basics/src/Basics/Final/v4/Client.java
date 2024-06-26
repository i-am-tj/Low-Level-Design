package Basics.Final.v4;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        // In this example we implement immutability e2e
        Date date = new Date(801783540000L);
        Human human1 = new Human("Tanuj", date);
        human1.display();
        date.setTime(864941940000L); // Set time of the date declared previously
        Human human2 = new Human("Tj", date);
        human2.display();
        // We again print to check if our first object was changed
        human1.display();

        // Now, here we see the age is not getting changed. This is the change we need to keep in mind for mutable objects
        // This was possible because of 2 changes -
        // 1. Setting and returning defensive copy
        // 2. Making the data members final (not necessary but helps)

    }
}
