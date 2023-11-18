package Creational.Singleton.v4;

import java.io.Serial;
import java.io.Serializable;

public class Database implements Serializable, Cloneable {
    private static Database instance = null;
    String url;
    String username;
    String password;

    private Database() {
        if (instance != null) {
            throw new RuntimeException("You have broken Singleton class!");
        }
    }

    public static Database getInstance() {
        if(instance == null) {
            synchronized (Database.class) { // we use synchronized block rather than a method
                if(instance == null) { // this is known as double checked locking as we check this twice
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    @Serial
    public Object readResolve() {
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

}