package Basics.Serializable.v0;

import java.io.Serializable;
import java.util.Date;

public class Player implements Serializable {
    private String username;
    private int age;

    public Player() {}

    public Player(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Age: " + this.age);
    }
}
