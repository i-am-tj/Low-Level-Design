package Creational.Singleton.v2;

public class Database {
    private static Database instance = null;
    String url;
    String username;
    String password;

    private Database() { //so that no one can access it from external class

    }

    public static synchronized Database getInstance() { //Now we use the synchronized keyword to stop multithreaded applications access it in same time
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

}
