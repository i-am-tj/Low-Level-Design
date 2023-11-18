package Creational.Singleton.v2;

public class Multithreaded implements Runnable {
    @Override
    public void run() {
        Database db = Database.getInstance();
        System.out.print(db.hashCode() + " ");
    }
}
