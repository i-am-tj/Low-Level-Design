package Creational.Factory.FactoryMethod.v1;

public class Autumn extends Season {
    @Override
    public Bird getBirdOfSeason() {
        return new Peacock();
    }
}
