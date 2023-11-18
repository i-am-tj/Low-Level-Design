package Creational.Singleton.v1;

import java.util.ArrayList;
import java.util.List;

public class Multithreaded implements Runnable {
    @Override
    public void run() {
        Database db = Database.getInstance();
        System.out.print(db.hashCode() + " ");
    }
}
