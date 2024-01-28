package Creational.Factory.FactoryMethod.v1;

public class Winter extends Season {
    @Override
    public Bird getBirdOfSeason() {
        return new Sparrow();
    }
}
