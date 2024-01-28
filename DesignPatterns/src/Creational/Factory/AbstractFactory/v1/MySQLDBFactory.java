package Creational.Factory.AbstractFactory.v1;

public class MySQLDBFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
