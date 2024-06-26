package Basics.Serializable.v1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Player implements Serializable {
    private String username;
    private Date dob;

    public Player() {}

    public Player(String username, Date dob) {
        this.username = username;
        this.dob = dob;
    }

    // Since there is a Date member variable
    // Hence we apply custom logic for serialization and de-serialization (not mandatory though)
    // This includes 2 methods -
    // 1. writeObject(ObjectOutputStream out)
    // 2. readObject(ObjectInputStream in)
    // In both we use the defaultWriteObject() and defaultReadObject() for other member variables
    // And out.writeObject(<member_variable>) for writing while (<member_variable_type>)in.readObject()

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.dob); // custom logic for date serialization
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.dob = (Date) in.readObject();
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Age: " + ((System.currentTimeMillis() - this.dob.getTime())/ (1000L * 60 * 60 * 24 * 365)));
    }
}
