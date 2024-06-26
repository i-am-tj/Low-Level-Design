package Basics.Cloneable.v0;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // To make any class Cloneable, it needs to implement the marker interface Cloneable
        // It makes the objects of the class cloneable and by default implements a shallow copy of the class
        // We will first see simple implementation of Cloneable with primitive and immutable data types
        Human human1 = new Human("Tanuj", 27);
        Human human2 = (Human) human1.clone();
        System.out.println("=== Post Clone | Without modification === ");
        human1.display();
        human2.display();
        System.out.println("=== Post Clone | With modification === ");
        human2.setName("Tj");
        human1.display();
        human2.display();

        // Here we can see we change the cloned object's data members and this does not change the data member of human object
        // In the next example we see what happens when there is a mutable object inside a class
    }
}
