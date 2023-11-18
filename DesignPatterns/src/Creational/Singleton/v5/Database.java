package Creational.Singleton.v5;

import java.io.Serializable;

public enum Database implements Serializable {
    INSTANCE;
    Database() {
        System.out.println("Database Constructor gets called");
    }
}
