package Creational.Factory.AbstractFactory.v1;

public class PostgreSQLDBFactory implements DatabaseFactory {

    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
