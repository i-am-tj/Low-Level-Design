package Creational.Singleton.v4;

import java.io.*;
import java.lang.reflect.Constructor;

import static java.lang.System.in;

public class Client {
    public static void main(String[] args) {
        // Approach - Since we have already tackled multithreading issue we will just focus on the breaking points now
        // Comment others before executing each
        //Check 1 - Reflection
        try {
            Database instance1 = Database.getInstance();
            System.out.println("Database.getInstance().hashCode: " + instance1.hashCode());

            Constructor constructor = Database.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            Database instance2 = (Database) constructor.newInstance();
            System.out.println("Reflection.newInstance().hashCode: " + instance2.hashCode());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //Check 2 - Serializable
        try {
            Database instance1 = Database.getInstance();
            System.out.println("Database.getInstance().hashCode: " + instance1.hashCode());

            // Serialize the object to file
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("file.txt"));
            objectOutput.writeObject(instance1);
            objectOutput.close();

            // DeSerailize the object from file
            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("file.txt"));
            Database instance2 = (Database) objectInput.readObject();
            in.close();

            System.out.println("Serialization.getInstance().hashCode: " + instance2.hashCode());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //Check 3 - Cloneable
        try {
            Database instance1 = Database.getInstance();
            System.out.println("Database.getInstance().hashCode: " + instance1.hashCode());

            Database instance2 = (Database) instance1.clone();
            System.out.println("Cloneable.getInstance().hashCode: " + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Through this we are able to see are able to solve 2 breaking points -
        // 1. Serialization using readResolve() from Serializable interface
        // 2. Cloneable using clone() from Cloneable interface

        // Reflection is something we still haven't been able to tackle
    }
}
