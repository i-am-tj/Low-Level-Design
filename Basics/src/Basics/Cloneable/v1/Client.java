package Basics.Cloneable.v1;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // In this example we have Date object in Human class
        // We will now understand the shallow copy of the cloneable interface
        Date date = new Date(801783540000L);
        Human human1 = new Human("Tanuj", date);
        Human human2 = (Human) human1.clone();
        System.out.println("=== Post Clone | Without modification === ");
        human1.display();
        human2.display();
        System.out.println("=== Post Clone | With modification === ");
        human2.setName("Tj");
        date.setTime(864941940000L);
        human1.display();
        human2.display();

        // Here we see if there is a mutable object then it can be modified from other classes since it was a shallow copy
        // Now we will see how we can implement a deep copy in the next example

    }
}
