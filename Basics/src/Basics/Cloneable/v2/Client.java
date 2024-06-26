package Basics.Cloneable.v2;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // In this example we create a deep copy of the Date object in Human class
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

        // Now here we can see even though the date object has been changed it is only reflected in the first object
        // Since a deep copy of the date object was implemented in the clone() method of Human class

        // In the next example we will see effect of Cloneable in inheritance
    }
}
