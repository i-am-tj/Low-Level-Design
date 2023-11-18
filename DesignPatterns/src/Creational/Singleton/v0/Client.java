package Creational.Singleton.v0;

public class Client {
    public static void main(String[] args) {
        //Approach 1
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        //Passes as after db1 no instance can be created every other instance will be null
        if (db1.hashCode() != db2.hashCode()) throw new AssertionError("Not Same");

        //But this shouldn't be the case. Each and every time it should be able to return the last class that was created when called

        //Hence we are moving on to the second approach
    }
}
