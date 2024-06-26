package Basics.Serializable.v1;

import java.io.*;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Player player = new Player("knight", new Date(864941940000L));
        // Serialise
        FileOutputStream fileOutputStream = new FileOutputStream("custom_out.ser"); // Creates a serialised file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // Here we apply a custom logic in Player class to make and make Date serializable (only for example purpose, works without it also)
        objectOutputStream.writeObject(player);
        // De-serialise
        FileInputStream fileInputStream = new FileInputStream("custom_out.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Player player1 = (Player) objectInputStream.readObject();
        player1.display(); // Player - Username: knight Age: 27

        //In the next example we will see versioning in and also how to opt out from being Serialized

    }
}
