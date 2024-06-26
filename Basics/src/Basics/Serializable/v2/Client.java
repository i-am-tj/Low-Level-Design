package Basics.Serializable.v2;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // In this example for Player class we don't want the password to be serialized and stored
        // To implement this we have used transient keyword
        // Transient is a serialization-specific modifier which is used mostly for temporary or non-essential data, or data that should not be persisted
        Player player = new Player("knight", "king123");
        //Serialize
        FileOutputStream fileOutputStream = new FileOutputStream("opt_out.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(player);
        //De-serialize
        FileInputStream fileInputStream = new FileInputStream("opt_out.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // Password is not saved and doesn't get any value
        Player player1 = (Player) objectInputStream.readObject(); // Player - Username: knight Password: null
        player1.display();

        // In this example we saw how any member variable can opt out from being serialized.
        // In the next example we will see how we can handle versioning

    }
}
