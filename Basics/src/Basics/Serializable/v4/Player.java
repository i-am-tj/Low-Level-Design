package Basics.Serializable.v4;

import java.io.Serializable;

public class Player implements Serializable {
    private String username;
    private transient String password;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Password: " + this.password);
    }

}
