package Basics.Serializable.v3;

import javax.imageio.IIOException;
import java.io.*;

public class Playerv2 implements Serializable {
    private static final long serialVersionUID = 2L;
    private String username;
    private transient String password;
    private String teamName;

    public Playerv2(String username, String password, String teamName) {
        this.username = username;
        this.password = password;
        this.teamName = teamName;
    }

    //TODO: Need to fix the logic for the deserialization (direct casting won't work)

    // Since JVM throws InvalidClassException hence during de-serialization we implement custom logic to handle it
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        Object object = in.readObject();
//        System.out.println("Object: " + object.toString());
//    }

    private Object readResolve() throws ObjectStreamException {
//
//        // Check versionUID
//        if (this instanceof Player) {
//            // Deserialize from Player format
//            Player player = (Player) this;
//            return new Playerv2(player.getUsername(), null, "unknown"); // Set default teamName for older data
//        }
        return this; // If version is current, return the object itself
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Password: " + this.password + " Team Name: " + this.teamName);
    }

}
