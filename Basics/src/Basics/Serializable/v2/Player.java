package Basics.Serializable.v2;

import java.io.Serializable;

public class Player implements Serializable {

    // A version UID is created by default by JVM internally, but we can also define it
    private static final long serialVersionUID = 1L; // this is used for versioning of the file (it helps in checking if the file has changed later)

    private String username;
    private transient String password; // opting out from serialization

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Password: " + this.password);
    }

}
