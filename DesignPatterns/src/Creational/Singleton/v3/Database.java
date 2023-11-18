package Creational.Singleton.v3;

public class Database {
    private static Database instance = null;
    String url;
    String username;
    String password;

    private Database() { //so that no one can access it from external class

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

}
