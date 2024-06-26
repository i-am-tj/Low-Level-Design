package Basics.Serializable.v0;

import java.io.*;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // To make any class Serializable it needs to implement the Serializable interface
        // Serializable is a marker interface which means it does not have any members or methods
        Player player = new Player("knight", 27);
        // Serialise
        FileOutputStream fileOutputStream = new FileOutputStream("out.ser"); // Creates a serialised file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(player);
        // De-serialise
        FileInputStream fileInputStream = new FileInputStream("out.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Player player1 = (Player) objectInputStream.readObject();
        player1.display(); // Player - Username: knight Age: 27

        // In this example we can see both serialise and deserialise works on a class which has implemented Serializable
        // In the next example we will see how to handle custom serialization in a class

    }
}
