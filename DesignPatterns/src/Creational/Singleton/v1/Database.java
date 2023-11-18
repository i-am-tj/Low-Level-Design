package Creational.Singleton.v1;

public class Database {
    private static Database instance = null;
    String url;
    String username;
    String password;

    private Database() { //so that no one can access it from external class

    }

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

}
