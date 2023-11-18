package Creational.Singleton.v0;

public class Database {
    private static int count = 0;

    String url;
    String username;
    String password;

    private Database() { //so that no one can access it from external class

    }

    public static Database getInstance() { //calls private constructor
        if(count == 0) {
            count += 1;
            return new Database();
        }
        return null;
    }
}
