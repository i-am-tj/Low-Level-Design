package Creational.Singleton.v3;

public class Multithreaded implements Runnable {
    @Override
    public void run() {
        Database db = Database.getInstance();
        System.out.print(db.hashCode() + " ");
    }
}
