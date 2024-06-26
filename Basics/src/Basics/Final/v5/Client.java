package Basics.Final.v5;

import Internals.EqualityCheck.v1.Human;

public class Client {
    public static void main(String[] args) {
        // In this example we will see a short difference between final reference vs final class
        // When the class is final, we can create multiple instances of the class with same variable
        Human human1 = new Human("Tanuj", 27);
        human1.display();
        human1 = new Human("Tanuj", 28);
        human1.display();
        // But when we create a reference variable as final
        final Player player1 = new Player("Tj", 15);
        player1.display();
        // We can not do the following
        // player1 = new Player("Tj", 20);
        // As we cannot reassign a value to a final variable
    }
}
