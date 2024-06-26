package Basics.Serializable.v3;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // In this example we consider a version change in file after serialization
        // Ideally every time de-serialization is applied JVM compares the version UID in both the files
        // If there is a drift then it results in InvalidClassException
        // Hence we ideally handle it in the later version of the file
        // Here, we have used 2 classes - Player and Playerv2 to denote first and second version of Player accordingly
        Player player = new Player("knight", "king123");
        //Serialize
        FileOutputStream fileOutputStream = new FileOutputStream("version.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(player);
        // De-serialize
        FileInputStream fileInputStream = new FileInputStream("version.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Playerv2 playerv2 = (Playerv2) objectInputStream.readObject(); // Does not work currently - Error - Exception in thread "main" java.lang.ClassCastException (Need to fix)
        playerv2.display();

        // In the next example we will see what happens when there is inheritance in place

    }
}
