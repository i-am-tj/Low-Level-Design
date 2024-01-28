package Creational.Factory.AbstractFactory.v1;

public class PostgreSQLDatabase implements Database {
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostgreSQLDBFactory();
    }
}
