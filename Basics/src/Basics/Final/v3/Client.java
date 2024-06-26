package Basics.Final.v3;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        // In this example we will enforce immutability on a class and see it's limitations
        Date date = new Date(801783540000L);
        Human human1 = new Human("Tanuj", date);
        human1.display();
        date.setTime(864941940000L); // Set time of the date declared previously
        Human human2 = new Human("Tj", date);
        human2.display();
        // Here we can see even though we see the change in date though we expected human1 to not change
        human1.display();

        // So why did it happen?
        // For any non-primitive data type (other than String which is mutable)
        // If we include these data structures which are not immutable, then there is always a possibility of it getting changed by another class
        // In such a scenario we should always pass a defensive copy
        // In the next example, we will see how to implement it
    }
}
