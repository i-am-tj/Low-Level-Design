package Creational.Factory.AbstractFactory.v1;

public class MySQLDatabase implements Database {
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLDBFactory();
    }
}
