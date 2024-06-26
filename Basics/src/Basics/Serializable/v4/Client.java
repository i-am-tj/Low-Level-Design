package Basics.Serializable.v4;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // In this example we will see that if any superclass extends Serializable then all the subclasses automatically implements Serializable
        ESportsPlayer player = new ESportsPlayer("knight", "king123", 2500);
        CricketPlayer cricketPlayer = new CricketPlayer("Tj", "tj123", 4000);

        //Serialize
        FileOutputStream fileOutputStream = new FileOutputStream("inheritance.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(player);
        //De-serialize
        FileInputStream fileInputStream = new FileInputStream("inheritance.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // Password is not saved and doesn't get any value
        ESportsPlayer player1 = (ESportsPlayer) objectInputStream.readObject();
        player1.display(); // E-Sports Player - Username: knight Password: null E-Sports Ranking: 2500

        // If we see above, clearly in ESportsPlayer class we never implemented the Serializable and it automatically took
        // Now for the next part we will see the CricketPlayer where we explicitly opted out from serialization
        // We will only implement the writeObject to validate the same

        //Serialize
        FileOutputStream fileOutputStream1 = new FileOutputStream("inheritance_opt_out.ser");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cricketPlayer); // Exception in thread "main" java.io.NotSerializableException: This class should not be serialized

        // This completes understanding of Serializable from files perspective

    }
}
