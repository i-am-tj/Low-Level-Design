package Creational.Singleton.v5;

import java.io.*;
import java.lang.reflect.Constructor;

import static java.lang.System.in;

public class Client {
    public static void main(String[] args) {
        // Brief - Enums in java are inherently singleton (Explanation below copied)

        // Explanation - In Java, an enum is a special type of class that represents a group of constants (enum constants).
        // Each enum constant is like a public, static final field (constant) of the enum type.
        // Enum constants are implicitly final and static, making them shared among all instances of the enum type.

        //Check 1 - Reflection
        try {
            Enum<?> instance1 = Database.INSTANCE;
            System.out.println("Database.getInstance().hashCode: " + instance1.hashCode());

            Constructor<? extends Enum<?>> constructor = (Constructor<? extends Enum<?>>) instance1.getClass().getDeclaredConstructor();
            constructor.setAccessible(true);

            Enum<?> instance2 = constructor.newInstance();
            System.out.println("Reflection.newInstance().hashCode: " + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Trying to access it will throw us an exception - java.lang.NoSuchMethodException for getConstructor as enum constructors are implicitly private and do not have a no-argument constructor.
        // This actually implies Reflection operations cannot be performed on enums

        //Check 2 - Serializable
        try {
            Database instance1 = Database.INSTANCE;
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
        // This also works

        // Enums are also thread-safe and non-cloneable

        //Hence enum singletons implementing Serializable can be the final version of Singleton we can actually be using for safest implementations
    }
}
